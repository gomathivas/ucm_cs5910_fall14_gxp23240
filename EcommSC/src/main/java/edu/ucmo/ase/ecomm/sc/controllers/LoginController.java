package edu.ucmo.ase.ecomm.sc.controllers;

import javax.servlet.http.HttpSession;

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

import edu.ucmo.ase.ecomm.sc.model.HeaderModel;
import edu.ucmo.ase.ecomm.sc.model.LoginModel;
import edu.ucmo.ase.ecomm.sc.model.SessionModel;
import edu.ucmo.ase.ecomm.sc.service.AppUserService;

@Controller
@RequestMapping("/login")
public class LoginController {

	private static final String REDIRECT = "redirect:/";
	private static final String LOGIN = "login";
	private static final String WELCOME_USER = "welcomeUser";
	private static final String HOME = "home";
	private static final String PAYMENT_SHIPPING = "paymentAndShipping";
	private static final String CHECK_OUT = "/checkOut";

	@Autowired
	@Qualifier("loginValidator")
	private Validator validator;

	@Autowired
	@Qualifier("appContext")
	private ApplicationContext appContext;
	
	@Autowired
	@Qualifier("sessionModel")
	private SessionModel sessionModel;
	
	@Autowired
	@Qualifier("appUserService")
	private AppUserService appUserService;
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}

	@RequestMapping(method = RequestMethod.GET)
	public String doLogin(Model model) {
		model.addAttribute("loginModel", appContext.getLoginModel());
		return LOGIN;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String doLogin(
			HttpSession session, Model model, @Validated LoginModel loginModel,
			BindingResult result) {

		System.out.println("login name " + loginModel.getUserName());
		System.out.println("password " + loginModel.getPassword());

		if (result.hasErrors()) {
			return LOGIN;
		} else {
			
			if(this.appUserService.validateAppUserLogin(this.sessionModel, loginModel))	{
				this.sessionModel.setUserLoggedIn(true);
				HeaderModel headerModel = sessionModel.getHeaderModel();
				headerModel.setUser(loginModel.getUserName());
				session.setAttribute("sessionModel", sessionModel);
			}
			else {
				model.addAttribute("userNotFoundMessage", "Username and Password did not match. Please try again");
				return LOGIN;
			}
			
		}
		
		if( this.sessionModel.isCheckOutAfterLogIn())	{
			this.sessionModel.setCheckOutAfterLogIn(false);
			return REDIRECT + CHECK_OUT;
		}
		
		return REDIRECT + HOME;

	}

}
