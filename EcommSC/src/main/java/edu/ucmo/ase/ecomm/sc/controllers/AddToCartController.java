package edu.ucmo.ase.ecomm.sc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.ucmo.ase.ecomm.sc.model.ProductModel;
import edu.ucmo.ase.ecomm.sc.model.SessionModel;
import edu.ucmo.ase.ecomm.sc.model.ShoppingCartModel;
import edu.ucmo.ase.ecomm.sc.service.ProductService;

@Controller
public class AddToCartController {

	@Autowired
	@Qualifier("appContext")
	private ApplicationContext appContext;

	@Autowired
	@Qualifier("sessionModel")
	private SessionModel sessionModel;

	@Autowired
	@Qualifier("productService")
	private ProductService productService;

	@RequestMapping(value = "/addToCartConfirm/{productId}")
	public String doAddToCartConfirm(HttpSession session, Model model,
			@PathVariable("productId") Integer productId) {

		ProductModel product = productService.getProductById(productId);
		sessionModel.setSelectedProductDetails(product);
		
		String requestPage =  (String) session.getAttribute("requestingPage");
		System.out.println("request page is : " + requestPage);
		
		sessionModel.setAddToCartRequestPage(requestPage);
		
		return "redirect:/addToCartConfirm";
	}

	@RequestMapping(value = "/addToCartConfirm")
	public String doAddToCartConfrim(HttpSession session, Model model) {
		String returnView = "addToCartConfirm";
		model.addAttribute("selectedProduct",
				sessionModel.getSelectedProductDetails());
		return returnView;
	}
	
	@RequestMapping(value = "/addToConfirmOk/{productId}")
	public String doAddToCartConfirmOk(HttpSession session, Model model,
			@PathVariable("productId") Integer productId) {
		
		SessionModel sessionModel = (SessionModel)session.getAttribute("sessionModel");
		String redirectPage = sessionModel.getAddToCartRequestPage();
		ProductModel product = productService.getProductById(productId);

		
		return "redirect:/addToConfirmOk";
	}

	@RequestMapping(value = "/addToConfirmOk")
	public String doAddToCartConfrimOk(HttpSession session, Model model) {
		String returnView = "addToConfirmOk";
	
		
		return returnView;
	}

}
