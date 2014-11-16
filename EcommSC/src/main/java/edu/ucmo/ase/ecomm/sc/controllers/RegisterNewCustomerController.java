package edu.ucmo.ase.ecomm.sc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.ucmo.ase.ecomm.sc.model.CustomerModel;

@Controller
@RequestMapping("/registerNewUser")
public class RegisterNewCustomerController {

	@Autowired
	@Qualifier("newCustomerValidator")
	private Validator validator;

	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}

	@RequestMapping(method = RequestMethod.GET)
	public String doWelcome(Model model) {
		model.addAttribute("customerModel", new CustomerModel());
		return "registerNewCustomer";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String doLogin(
			Model model, @Validated CustomerModel customerModel,
			BindingResult result) {

		String returnView = "welcomeNewCustomer";
		
		if (result.hasErrors()) {
			returnView = "registerNewCustomer";
		} else {

		}
		return returnView;

	}

}
