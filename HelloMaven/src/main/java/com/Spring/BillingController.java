package com.Spring;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.frontendDAO.BillingDAO;
import com.frontendModel.Billing;
import com.frontendModel.UsersDetail;

@Controller


public class BillingController {
	
	@Autowired
	BillingDAO billingDAO;
	@RequestMapping("/billingPage")
	public ModelAndView getShipPage()
	{
		Billing user = new Billing();
		return new ModelAndView("Billing", "BillingDetail", user);
		
		
		
	}
	
	@RequestMapping("/billingPage1")
	public ModelAndView shippingPage(@Valid @ModelAttribute("BillingDetail") Billing billing)
	
	{
		
	  billingDAO.save(billing);
		User activeUser = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String name = activeUser.getUsername();
		ModelAndView model1=new ModelAndView("thankYou");
		return model1;
	}

	
}
