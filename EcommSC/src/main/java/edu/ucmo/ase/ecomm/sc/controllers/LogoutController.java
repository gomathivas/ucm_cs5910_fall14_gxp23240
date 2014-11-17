package edu.ucmo.ase.ecomm.sc.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.ucmo.ase.ecomm.sc.model.SessionModel;
import edu.ucmo.ase.ecomm.sc.service.ProductService;

@Controller
@RequestMapping("/logout")
public class LogoutController {
	
	@Autowired
	@Qualifier("appContext")
	private ApplicationContext appContext;
	
	@Autowired
	@Qualifier("sessionModel")
	private SessionModel sessionModel;
	
	@Autowired
	@Qualifier("productService")
	private ProductService productService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String doWelcome(HttpSession session, Model model) {
		
		session.invalidate();
		return "redirect:/login";
	}

}
