package edu.ucmo.ase.ecomm.sc.controllers;

import edu.ucmo.ase.ecomm.sc.model.LoginModel;

public class ApplicationContext {
	
	private LoginModel loginModel;

	public LoginModel getLoginModel() {
		return loginModel;
	}

	public void setLoginModel(LoginModel loginModel) {
		this.loginModel = loginModel;
	}
	
}
