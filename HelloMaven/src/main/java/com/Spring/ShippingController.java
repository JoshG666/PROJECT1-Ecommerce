package com.Spring;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.frontendDAO.ShippingDAO;
import com.frontendModel.Shipping;
import com.frontendModel.UsersDetail;

@Controller


public class ShippingController {
	
	@Autowired
	ShippingDAO shippingDAO;
	@RequestMapping("/shippingPage")
	public ModelAndView getShipPage()
	{
		Shipping user = new Shipping();
		return new ModelAndView("Shipping", "Shippingdetail", user);
		
		
		
	}
	
	@RequestMapping("/shippingPage1")
	public ModelAndView shippingPage(@Valid @ModelAttribute("Shippingdetail") Shipping shipping)
	
	{
		
	  shippingDAO.save(shipping);
		/*User activeUser = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String name = activeUser.getUsername();*/
		ModelAndView model1=new ModelAndView("Billing");
		return model1;
	}

	
}
