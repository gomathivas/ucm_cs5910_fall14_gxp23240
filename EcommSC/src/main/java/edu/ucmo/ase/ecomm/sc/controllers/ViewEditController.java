package edu.ucmo.ase.ecomm.sc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.ucmo.ase.ecomm.sc.model.SessionModel;
import edu.ucmo.ase.ecomm.sc.model.ShoppingCartListModel;
import edu.ucmo.ase.ecomm.sc.model.ShoppingCartModel;
import edu.ucmo.ase.ecomm.sc.service.ProductService;


@Controller
public class ViewEditController {
	
	@Autowired
	@Qualifier("appContext")
	private ApplicationContext appContext;
	
	@Autowired
	@Qualifier("sessionModel")
	private SessionModel sessionModel;
	
	@Autowired
	@Qualifier("productService")
	private ProductService productService;
	
	@RequestMapping(value = "/viewEditCart", method = RequestMethod.GET)
	public String doViewEditCart(Model model) {
		
		String returnView = "viewEditCart";
		ShoppingCartListModel scListModel = this.sessionModel.getShoppingCartListModel();
		model.addAttribute("sclistModel", scListModel);
		model.addAttribute("scListTotal", ShoppingCartListModel.getTotal(scListModel.getScmList()));
		return returnView;
	}
	
	@RequestMapping(value = "/updateCart", method = RequestMethod.POST)
	public String updateCart(Model model, @ModelAttribute("sclistModel") ShoppingCartListModel scListModel) {
		
		String returnView = "/viewEditCart";
//		List<ShoppingCartModel> scmList = this.sessionModel.getShoppingCartModel().getScmList();
		
//		System.out.println(scmList);
//		
//		model.addAttribute("scList", scmList);
//		model.addAttribute("scListTotal", ShoppingCartModel.getTotal(scmList));
		return returnView;
	}

}
