package edu.ucmo.ase.ecomm.sc.model;

import org.springframework.context.annotation.Scope;

@Scope("session")
public class HeaderModel {
	
	private String searchKeyWord;
	private String user;
	
	public String getSearchKeyWord() {
		return searchKeyWord;
	}
	public void setSearchKeyWord(String searchKeyWord) {
		this.searchKeyWord = searchKeyWord;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
}
