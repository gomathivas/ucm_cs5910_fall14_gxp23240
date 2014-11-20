package edu.ucmo.ase.ecomm.sc.domain;

public enum AppRoleEnum {
	
	ADMIN("AD"),
	CUSTOMER("CUST"),
	;
	
	
	private String roleCode;
	

	private AppRoleEnum(String roleCode) {
		this.roleCode = roleCode;
	}


	public String getRoleCode() {
		return roleCode;
	}

}


