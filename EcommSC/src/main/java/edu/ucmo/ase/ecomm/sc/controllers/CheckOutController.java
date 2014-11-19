package edu.ucmo.ase.ecomm.sc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.ucmo.ase.ecomm.sc.model.SessionModel;
import edu.ucmo.ase.ecomm.sc.service.ProductService;

@Controller
public class CheckOutController {
	
	private static final String PAYMENT_AND_SHIPPING = "paymentAndShipping";
	private static final String REDIRECT = "redirect:/";
	private static final String CHECK_OUT = "/checkOut";
	private static final String LOG_IN = "login";

	@Autowired
	@Qualifier("appContext")
	private ApplicationContext appContext;
	
	@Autowired
	@Qualifier("sessionModel")
	private SessionModel sessionModel;
	
	@Autowired
	@Qualifier("productService")
	private ProductService productService;
	
	@RequestMapping(value = CHECK_OUT, method = RequestMethod.GET)
	public String doCheckOut(Model model) {
		
		String returnView = PAYMENT_AND_SHIPPING;
		
		if( ! this.sessionModel.isUserLoggedIn())	{
			return REDIRECT + LOG_IN;
		}
	
		return returnView;
	}
	
}
