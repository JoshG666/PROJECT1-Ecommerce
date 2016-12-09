package com.frontendDAO;



import java.util.List;

import com.frontendModel.Category;

public interface CategoryDAO {
	public boolean saveorUpdate (Category category);
	
	public boolean delete(String category_id);
	public Category getByName(String category_name);
	public Category get(String category_id);
		public List<Category> list();
	
	

}

