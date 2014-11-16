package edu.ucmo.ase.ecomm.sc.controllers;

import java.util.List;

import edu.ucmo.ase.ecomm.sc.model.LoginModel;
import edu.ucmo.ase.ecomm.sc.model.ProductModel;

public class ApplicationContext {
	
	private LoginModel loginModel;
	private List<ProductModel> homeProducts;
	
	public LoginModel getLoginModel() {
		return loginModel;
	}
	public void setLoginModel(LoginModel loginModel) {
		this.loginModel = loginModel;
	}
	public List<ProductModel> getHomeProducts() {
		return homeProducts;
	}
	public void setHomeProducts(List<ProductModel> homeProducts) {
		this.homeProducts = homeProducts;
	}
	
}
