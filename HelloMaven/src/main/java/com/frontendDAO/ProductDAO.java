package com.frontendDAO;


import java.util.List;

import com.frontendModel.Product;

public interface ProductDAO {




	public boolean save(Product product);

	public boolean update(Product product);

	public boolean saveOrUpdate(Product product);

	public boolean delete(String  product_id);

	public Product get(String product_id);
	
	public Product getByName(String product_name);

	public List<Product> list();

	
	

}

