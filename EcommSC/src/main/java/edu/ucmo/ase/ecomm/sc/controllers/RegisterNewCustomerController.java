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

import edu.ucmo.ase.ecomm.sc.domain.AppRoleEnum;
import edu.ucmo.ase.ecomm.sc.model.CustomerModel;
import edu.ucmo.ase.ecomm.sc.model.SessionModel;
import edu.ucmo.ase.ecomm.sc.service.AppUserService;

@Controller
@RequestMapping("/registerNewUser")
public class RegisterNewCustomerController {

	private static final String REDIRECT = "redirect:/";
	private static final String REGISTER_NEW_CUSTOMER = "registerNewCustomer";
	private static final String HOME = "home";

	@Autowired
	@Qualifier("appContext")
	private ApplicationContext appContext;
	
	@Autowired
	@Qualifier("sessionModel")
	private SessionModel sessionModel;
	
	@Autowired
	@Qualifier("newCustomerValidator")
	private Validator validator;
	
	@Autowired
	@Qualifier("appUserService")
	private AppUserService appUserService;

	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}

	@RequestMapping(method = RequestMethod.GET)
	public String doWelcome(Model model) {
		model.addAttribute("customerModel", new CustomerModel());
		return REGISTER_NEW_CUSTOMER;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String doLogin(
			Model model, @Validated CustomerModel customerModel,
			BindingResult result) {

		
		if (result.hasErrors()) {
			return REGISTER_NEW_CUSTOMER;
		} else {
			this.sessionModel.setCustomerModel(customerModel);
			this.appUserService.addAppUser(sessionModel, AppRoleEnum.CUSTOMER);
		}
		return REDIRECT + HOME;

	}

}
