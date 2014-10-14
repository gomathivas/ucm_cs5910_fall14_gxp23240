package edu.ucmo.ase.sc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/SC")
public class HomePageController {

	@RequestMapping(method = RequestMethod.GET)
	public String hello(ModelMap model) {

		model.addAttribute("name", "Hurray!");
		return "home";

	}

}
