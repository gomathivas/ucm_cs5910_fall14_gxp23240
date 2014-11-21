package edu.ucmo.ase.ecomm.sc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.ucmo.ase.ecomm.sc.model.SessionModel;
import edu.ucmo.ase.ecomm.sc.model.ShoppingCartListModel;
import edu.ucmo.ase.ecomm.sc.model.ShoppingCartModel;
import edu.ucmo.ase.ecomm.sc.service.ProductService;
import edu.ucmo.ase.ecomm.sc.service.ShoppingCartService;


@Controller
public class ViewEditCartController {
	
	private static final String VIEW_EDIT_CART = "viewEditCart";
	private static final String REDIRECT = "redirect:/";

	@Autowired
	@Qualifier("appContext")
	private ApplicationContext appContext;
	
	@Autowired
	@Qualifier("sessionModel")
	private SessionModel sessionModel;
	
	@Autowired
	@Qualifier("productService")
	private ProductService productService;
	
	@Autowired
	@Qualifier("shoppingCartService")
	private ShoppingCartService scService;
	
	
	
	@RequestMapping(value = "/viewEditCart", method = RequestMethod.GET)
	public String doViewEditCart(Model model) {
		
		ShoppingCartListModel scListModel = this.sessionModel.getShoppingCartListModel();
		model.addAttribute("sclistModel", scListModel);
		model.addAttribute("scListTotal", ShoppingCartListModel.getTotal(scListModel.getScmList()));
		
		if(this.sessionModel.isEditSC())	{
			model.addAttribute("scm", this.sessionModel.getEditSCModel());
			model.addAttribute("edit", true);
			this.sessionModel.setEditSC(false);
		}
		return VIEW_EDIT_CART;
	}
	
	@RequestMapping("/editSC/{productId}")
	public String editCart(@PathVariable("productId") Integer id, Model model) {
		
		ShoppingCartListModel scListModel = this.sessionModel.getShoppingCartListModel();
		ShoppingCartModel editSC = this.scService.getShoppingCartByProductId(id, scListModel);
		
		this.sessionModel.setEditSCModel(editSC);
		this.sessionModel.setEditSC(true);
		 
		return REDIRECT + VIEW_EDIT_CART;
	}

	
	@RequestMapping(value = "/updateCart", method = RequestMethod.POST)
	public String updateCart(Model model, @ModelAttribute("scm") ShoppingCartModel scModel) {
		
		ShoppingCartListModel scl = this.sessionModel.getShoppingCartListModel();
		
		this.scService.udpateShoppingCart(scl, scModel);
		
		return REDIRECT + VIEW_EDIT_CART;
	}
	
	

}
