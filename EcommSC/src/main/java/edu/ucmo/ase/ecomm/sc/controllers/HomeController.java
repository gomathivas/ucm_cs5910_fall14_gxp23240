package edu.ucmo.ase.ecomm.sc.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.ucmo.ase.ecomm.sc.model.LoginModel;

@Controller
@RequestMapping("/home")
public class HomeController {

	@RequestMapping(method = RequestMethod.GET)
	public String doWelcome(Model model) {
		model.addAttribute("loginModel", new LoginModel());
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
