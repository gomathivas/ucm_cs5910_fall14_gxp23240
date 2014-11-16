package edu.ucmo.ase.sc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.ucmo.ase.sc.domain.AppUser;
import edu.ucmo.ase.sc.domain.AppUserHome;

@Controller
@RequestMapping("/SC")
public class HomePageController {

	@RequestMapping(method = RequestMethod.GET)
	public String hello(ModelMap model) {
		AppUser user = new AppUser();
		user.setFirstName("testFirst");
		user.setLastName("testLast");
		user.setGender("Maler");
		AppUserHome userHome = new AppUserHome();
		userHome.persist(user);
		model.addAttribute("name", "Hurray!");
		return "home";

	}

}
