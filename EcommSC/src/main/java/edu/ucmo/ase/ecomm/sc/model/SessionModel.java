package edu.ucmo.ase.ecomm.sc.model;

import org.springframework.context.annotation.Scope;

@Scope("session")
public class SessionModel {
	
	private HeaderModel headerModel;
	private ShoppingCartModel shoppingCartModel;
	private boolean userLoggedIn = false;
	private ProductModel selectedProductDetails;
	private String addToCartRequestPage;
	
	/**
	 * The user input for searching products
	 */
	private String searchKeyWord;
	
	public HeaderModel getHeaderModel() {
		return headerModel;
	}

	public void setHeaderModel(HeaderModel headerModel) {
		this.headerModel = headerModel;
	}

	public ShoppingCartModel getShoppingCartModel() {
		return shoppingCartModel;
	}

	public void setShoppingCartModel(ShoppingCartModel shopppingCartModel) {
		this.shoppingCartModel = shopppingCartModel;
	}

	public String getSearchKeyWord() {
		return searchKeyWord;
	}

	public void setSearchKeyWord(String searchKeyWord) {
		this.searchKeyWord = searchKeyWord;
	}

	public ProductModel getSelectedProductDetails() {
		return selectedProductDetails;
	}

	public void setSelectedProductDetails(ProductModel selectedProductDetails) {
		this.selectedProductDetails = selectedProductDetails;
	}
	
	
	public boolean isUserLoggedIn() {
		return userLoggedIn;
	}

	public boolean getUserLoggedIn() {
		return userLoggedIn;
	}

	
	public void setUserLoggedIn(boolean userLoggedIn) {
		this.userLoggedIn = userLoggedIn;
	}

	public String getAddToCartRequestPage() {
		return addToCartRequestPage;
	}

	public void setAddToCartRequestPage(String addToCartRequestPage) {
		this.addToCartRequestPage = addToCartRequestPage;
	}
	

	
}
