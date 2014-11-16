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

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	@Qualifier("loginValidator")
	private Validator validator;

	@Autowired
	@Qualifier("sessionHeaderModel")
	private HeaderModel headerModel;
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}

	@RequestMapping(method = RequestMethod.GET)
	public String doWelcome(Model model) {
		model.addAttribute("loginModel", new LoginModel());
		return "login";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String doLogin(
			HttpSession session, Model model, @Validated LoginModel loginModel,
			BindingResult result) {

		String returnView = "welcomeUser";

		System.out.println("login name " + loginModel.getUserName());
		System.out.println("password " + loginModel.getPassword());

		if (result.hasErrors()) {
//			model.addAttribute("login", loginModel);
			returnView = "login";
		} else {
			headerModel.setUser(loginModel.getUserName());
			session.setAttribute("sessionHeaderModel", headerModel);
//			model.addAttribute("sessionHeaderModel", headerModel);
		}
		return returnView;

	}

}
