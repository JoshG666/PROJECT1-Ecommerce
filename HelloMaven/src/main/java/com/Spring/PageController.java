package com.Spring;




import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.frontendDAO.CategoryDAO;
import com.frontendDAO.ProductDAO;
import com.frontendDAO.UsersDetailDao;
import com.frontendModel.UsersDetail;
import com.frontendModel.Product;


@Controller
public class PageController

{
	@Autowired
	UsersDetailDao usersDetailDAO;
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private ProductDAO productDAO;
	
	@RequestMapping("/403")
	public String getaccessPage()
	{
		return "accessdeniedpage";
	}
	
	@RequestMapping("/")
	public ModelAndView getPage( @ModelAttribute("selectedProduct") final Product selectedProduct) {
		
		ModelAndView model=new ModelAndView("/index");
		
		model.addObject("categoryList", categoryDAO.list());
		model.addObject("productList", productDAO.list());
		
		
		System.out.println("inside / mapping");

		if(selectedProduct!=null){
			model.addObject("selectedProduct",selectedProduct);
		}
		else
			System.out.println("The object is null");
		
		return model;
		
	}
	@RequestMapping("/about")
	public String getAboutPage()
	{
		return "ABOUT";
	}
	@RequestMapping("/contact")
	public String getContactPage()
	{
		return "contact";
	}
	/*@RequestMapping("/user/contact")
	public String getuserPage()
	{
		return "contact";
	}*/
	@RequestMapping("/index")
	public String getIndexPage()
	{
		return "index";
	}
	@RequestMapping("/loginpage")
	public String getLoginPage()
	{
		return "login";
	}
	@RequestMapping("/single")
	public String getSinglePage()
	{
		return "single";
	}
	@RequestMapping("/checkout")
	public String getCheckoutPage()
	{
		return "checkout";
	}
	@RequestMapping("/register")
	public ModelAndView getRegistertPage()
	{
		UsersDetail user = new UsersDetail();
		return new ModelAndView("register", "userdetail", user);
		
		
		
	}
	/*@RequestMapping("/register")
	public String registermodel(Model model) {
		UsersDetail user = new UsersDetail();
		model.addAttribute("usersdetail", user);
		return "register";
	}*/
	@RequestMapping("/processform")
	public ModelAndView processform(@Valid @ModelAttribute("userdetail") UsersDetail usersDetail, BindingResult result)

	{
		System.out.println(usersDetail.getUserPhone());
		System.out.println(result);
		if(result.hasErrors()){
		
			ModelAndView model1=new ModelAndView("register");
			return model1;
		}
		
		System.out.println(usersDetail);
		usersDetail.setEnabled(true);
		usersDetailDAO.addUser(usersDetail);
		
		ModelAndView model1=new ModelAndView("index");
		return model1;
		
	}
	@RequestMapping("/placed")
	public String getPlacedPage()
	{
		return "placed";
	}
	/*@RequestMapping("/shippingPage")
	public String getShippingPage()
	{
		return "Shipping";
	}*/
	@RequestMapping("/thankYouPage")
	public String getthankYouPage()
	{
		return "thankYou";
	}
	@RequestMapping("/contact2")
	public String getcontact2Page()
	{
		return "contact2";
	}
	
	
	
	
}



