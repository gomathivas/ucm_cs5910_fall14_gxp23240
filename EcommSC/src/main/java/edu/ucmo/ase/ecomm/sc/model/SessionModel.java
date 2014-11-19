package edu.ucmo.ase.ecomm.sc.model;

import org.springframework.context.annotation.Scope;

@Scope("session")
public class SessionModel {
	
	private HeaderModel headerModel;
	private ShoppingCartListModel shoppingCartListModel;
	private boolean userLoggedIn = false;
	private ProductModel selectedProductDetails;
	private String addToCartRequestPage;
	private boolean checkOutAfterLogIn;
	private PaymentModel paymentModel;
	
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

	public ShoppingCartListModel getShoppingCartListModel() {
		return shoppingCartListModel;
	}

	public void setShoppingCartListModel(ShoppingCartListModel shoppingCartListModel) {
		this.shoppingCartListModel = shoppingCartListModel;
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

	public boolean isCheckOutAfterLogIn() {
		return checkOutAfterLogIn;
	}

	public void setCheckOutAfterLogIn(boolean checkOutAfterLogIn) {
		this.checkOutAfterLogIn = checkOutAfterLogIn;
	}

	public PaymentModel getPaymentModel() {
		return paymentModel;
	}

	public void setPaymentModel(PaymentModel paymentModel) {
		this.paymentModel = paymentModel;
	}
	

	
}
