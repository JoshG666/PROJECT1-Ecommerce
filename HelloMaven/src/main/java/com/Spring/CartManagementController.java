package com.Spring;



import com.frontendDAO.CartDAO;
import com.frontendDAO.CartItemDAO;
import com.frontendDAO.UsersDetailDao;
import com.frontendModel.Cart;
import com.frontendModel.CartItem;
import com.frontendModel.UsersDetail;
import com.frontendDAO.ProductDAO;
import com.frontendModel.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/usercart/cart")
public class CartManagementController {

	@Autowired
	private CartDAO cartDao;

	@Autowired
	private CartItemDAO cartItemDao;

	@Autowired
	private UsersDetailDao usersDetailDao;

	@Autowired
	private ProductDAO productDAO;

	
	 @RequestMapping(value="/refreshCart/{cartId}") 
	 String getCartById(@PathVariable(value = "cartId") int cartId) {
		 	return "redirect:/user/cart/" + cartId;
	 }
	 

	// addItem method is used to add a item in user cart.

	@RequestMapping(value = "/addItem/{id}", method = RequestMethod.GET)
	public String addItem(@PathVariable(value = "id") String id, Model model) {

		User activeUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		UsersDetail usersDetail = usersDetailDao.getUserByUsername(activeUser.getUsername());
		Cart cart = usersDetail.getCart();

		Product product = productDAO.get(id);
		List<CartItem> cartItems = cart.getCartItems();
		
		double grandTotal=0.0;
		for (int i = 0; i < cartItems.size(); i++) {
		
			if (product.getProduct_id() == cartItems.get(i).getProduct().getProduct_id()) {
				CartItem cartItem = cartItems.get(i);
				
				cartItem.setQuantity(cartItem.getQuantity() + 1);
				cartItem.setTotalPrice(product.getProduct_price() * cartItem.getQuantity());
				cartItemDao.addCartItem(cartItem);	
				
				for (int j = 0; j < cartItems.size(); j++) {
					grandTotal = grandTotal + cartItem.getTotalPrice();
				}
				cart.setGrandTotal(grandTotal);
				
				try {
					cartDao.validate(cart.getCartId());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				model.addAttribute("cartId", cart.getCartId());
				model.addAttribute("successMsg", product.getProduct_name() + " added to cart");
				model.addAttribute("cartList", cartItemDao.getAllCartItems(cart.getCartId()));
				return "cart";
			}
		}

		CartItem cartItem = new CartItem();
		cartItem.setProduct(product);
		cartItem.setQuantity(1);
		cartItem.setTotalPrice(product.getProduct_price() * cartItem.getQuantity());
		cartItem.setCart(cart);
		cartItemDao.addCartItem(cartItem);
		
		
		for (int j = 0; j < cartItems.size(); j++) {
			grandTotal = grandTotal + cartItem.getTotalPrice();
		}
		cart.setGrandTotal(grandTotal);
		cartDao.update(cart);
			
		model.addAttribute("successMsg", product.getProduct_name() + " product added to cart");
		model.addAttribute("cartId", cart.getCartId());
		model.addAttribute("cartList", cartItemDao.getAllCartItems(cart.getCartId()));
		return "cart";
	}

	/* removeItem method is used to remove a item from user cart. */

	@RequestMapping(value = "/removeItem/{id}/{cartId}", method = RequestMethod.GET)
	public String removeItem(@PathVariable(value = "id") String id, @PathVariable(value = "cartId") int cartId,
			Model model) {
		CartItem cartItem = cartItemDao.getCartItemByProductId(id, cartId);
		if (cartItem != null) {
			cartItemDao.removeCartItem(cartItem);
		} else {
			System.out.println("object is null");
		}
		return "redirect:/user/cart/" + cartId;
	}
	
	@RequestMapping(value = "/addQty/{id}/{cartId}", method = RequestMethod.GET)
	public String addQuantity(@PathVariable(value = "id") String id, @PathVariable(value = "cartId") int cartId,
			Model model) {
		CartItem cartItem = cartItemDao.getCartItemByProductId(id, cartId);

		Product product=productDAO.get(id);
		cartItem.setQuantity(cartItem.getQuantity() + 1);
		cartItem.setTotalPrice(cartItem.getQuantity()*product.getProduct_price());
		cartItemDao.addCartItem(cartItem);	
		return "redirect:/user/cart/" + cartId;
	}

	@RequestMapping(value = "/reduceQty/{id}/{cartId}", method = RequestMethod.GET)
	public String reduceQuantity(@PathVariable(value = "id") String id, @PathVariable(value = "cartId") int cartId,
			Model model) {
		CartItem cartItem = cartItemDao.getCartItemByProductId(id, cartId);

		Product product=productDAO.get(id);
		if(cartItem.getQuantity()>0){
		cartItem.setQuantity(cartItem.getQuantity() - 1);
		cartItem.setTotalPrice(cartItem.getQuantity()*product.getProduct_price());
		cartItemDao.addCartItem(cartItem);
		}
		return "redirect:/user/cart/" + cartId;
	}
	
	@RequestMapping(value = "/update/{cartId}", method = RequestMethod.GET)
	public String updateCart(@PathVariable(value = "id") String id, @PathVariable(value = "cartId") int cartId,
			Model model) {

		CartItem cartItem = null;
		
		double grandTotal = 0.0;
		List<CartItem> cartItems=cartItemDao.getAllCartItems(cartId);
		for (int j = 0; j < cartItems.size(); j++) {
			grandTotal += cartItem.getTotalPrice();
		}
		Cart cart=cartDao.getCartById(cartId);
		cart.setGrandTotal(grandTotal);
		cartDao.update(cart);
		return "redirect:/user/cart/" + cartId;
	}
	

	/* clearCartItems method is used to remove all items from user cart. */

	@RequestMapping(value = "/clearCartItems/{cartId}", method = RequestMethod.GET)
	public String clearCartItems(@PathVariable(value = "cartId") int cartId, Model model) {
		Cart cart = cartDao.getCartById(cartId);
		cartItemDao.removeAllCartItems(cart);
		return "redirect:/user/cart/" + cartId;
	}

}