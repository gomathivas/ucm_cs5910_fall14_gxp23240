package edu.ucmo.ase.ecomm.sc.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ucmo.ase.ecomm.sc.model.ProductModel;
import edu.ucmo.ase.ecomm.sc.model.SessionModel;
import edu.ucmo.ase.ecomm.sc.model.ShoppingCartListModel;
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
		
//		SessionModel sessionModel = (SessionModel)session.getAttribute("sessionModel");
		String redirectPage = sessionModel.getAddToCartRequestPage();
		
		System.out.println("redirect page " + redirectPage);
		
		ProductModel product = productService.getProductById(productId);
		
		ShoppingCartListModel scModel = sessionModel.getShoppingCartListModel();
		
		scModel.addProductToCart(product);
		session.setAttribute("sessionModel", sessionModel);
		
		return "redirect:/" + redirectPage;
	}

}
