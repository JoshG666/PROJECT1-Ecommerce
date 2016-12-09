 package com.Spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.frontendDAO.CategoryDAO;
import com.frontendModel.Category;
import com.frontend.util.Util;

@Controller
public class CategoryController {

	@Autowired
	private CategoryDAO categoryDAO;
	

	@Autowired(required = true)
	@Qualifier(value = "CategoryDAO")
	public void setCategoryDAO(CategoryDAO categoryDAO) {
		this.categoryDAO = categoryDAO;
	}
	
	
	@RequestMapping(value = "/categories", method = RequestMethod.GET)
	public String listCategories(Model model) {
		System.out.println("Hello.. I'm inside /categories list");
		//TO CARRY THE DATA TO NEXT PAGE
		model.addAttribute("category", new Category());
	
		model.addAttribute("isAdminClickedCategories", "true");
		model.addAttribute("categoryList",categoryDAO.list());
		System.out.println("after categorydao");
		return "Admin";
	}

	// For add and update category both
	@RequestMapping(value = "/category/add", method = RequestMethod.POST)
	public String addCategory(@ModelAttribute("category") Category category, Model model) {

		System.out.println("Hello.. I'm inside /categories add");
		
		String newID=Util.removeComma(category.getCategory_id());
		category.setCategory_id(newID);
		model.addAttribute("isAdminClickedCategories", "true");
		categoryDAO.saveorUpdate(category);
		model.addAttribute("categoryList",categoryDAO.list());
		System.out.println(categoryDAO.list());
		/*catch(Exception e)
		{
			System.out.println(e);
		}
*/		
		return "redirect:/categories";
	}

	
	
	
	@RequestMapping("/category/remove/{category_id}")
	public String removeCategory(@PathVariable("category_id") String id, ModelMap model) throws Exception {

		System.out.println("Hello.. I'm inside /categories remove");
		
		try {
			categoryDAO.delete(id);
			model.addAttribute("message", "Successfully Added");
		} catch (Exception e) {
			model.addAttribute("message", e.getMessage());
			e.printStackTrace();
		}
		// redirectAttrs.addFlashAttribute(arg0, arg1)
		return "redirect:/categories";
	}

	@RequestMapping("/category/edit/{category_id}")
	public String editCategory(@PathVariable("category_id") String id, Model model) {
		System.out.println("Hello.. I'm inside /categories edit");
		model.addAttribute("category", this.categoryDAO.get(id));
		model.addAttribute("isAdminClickedEditCategories", "true");
		model.addAttribute("listCategories", this.categoryDAO.list());
		return "Admin";
	}
	
}


