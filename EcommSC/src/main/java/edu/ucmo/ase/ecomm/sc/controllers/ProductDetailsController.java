package edu.ucmo.ase.ecomm.sc.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.ucmo.ase.ecomm.sc.model.LoginModel;
import edu.ucmo.ase.ecomm.sc.model.ProductModel;
import edu.ucmo.ase.ecomm.sc.model.SessionModel;
import edu.ucmo.ase.ecomm.sc.service.ProductService;

@Controller
public class ProductDetailsController {

	@Autowired
	@Qualifier("appContext")
	private ApplicationContext appContext;
	
	@Autowired
	@Qualifier("sessionModel")
	private SessionModel sessionModel;
	
	@Autowired
	@Qualifier("productService")
	private ProductService productService;
	
	
	@RequestMapping(value= "/details/{productId}")
	public String doGetProductDetails(Model model, @PathVariable("productId") Integer productId) {
		
		ProductModel product = productService.getProductById(productId);
		sessionModel.setSelectedProductDetails(product);
		
		return "redirect:/details";
	}
	
	@RequestMapping(value="/details")
	public String showShowProductsDeatils(HttpSession session, Model model)	{
		String returnView = "details";
		model.addAttribute("selectedProduct", sessionModel.getSelectedProductDetails());
		return returnView;
	}
	

}
