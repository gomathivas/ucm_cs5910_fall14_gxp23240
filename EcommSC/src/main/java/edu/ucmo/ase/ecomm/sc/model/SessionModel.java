package edu.ucmo.ase.ecomm.sc.model;

import org.springframework.context.annotation.Scope;

@Scope("session")
public class SessionModel {
	
	private HeaderModel headerModel;
	
	public HeaderModel getHeaderModel() {
		return headerModel;
	}

	public void setHeaderModel(HeaderModel headerModel) {
		this.headerModel = headerModel;
	}
	
}
