package com.frontendDAO;

import java.io.IOException;

import com.frontendModel.Cart;

public interface CartDAO {
	 Cart getCartById (int cartId);
	    
	   Cart validate(int cartId) throws IOException;  
	    
	    public void update(Cart cart);

}
