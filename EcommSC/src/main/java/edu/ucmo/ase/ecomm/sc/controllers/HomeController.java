package edu.ucmo.ase.ecomm.sc.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.ucmo.ase.ecomm.sc.model.LoginModel;
import edu.ucmo.ase.ecomm.sc.model.SessionModel;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	@Qualifier("appContext")
	private ApplicationContext appContext;
	
	@Autowired
	@Qualifier("sessionModel")
	private SessionModel sessionModel;

	@RequestMapping(method = RequestMethod.GET)
	public String doWelcome(Model model) {
		model.addAttribute("loginModel", appContext.getLoginModel());
		return "home";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String doLogin(
			HttpSession session, Model model, @Validated LoginModel loginModel,
			BindingResult result) {

		String returnView = "home";
		return returnView;

	}
}
