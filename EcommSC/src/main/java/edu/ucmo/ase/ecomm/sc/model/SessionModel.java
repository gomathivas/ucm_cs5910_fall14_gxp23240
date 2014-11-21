package edu.ucmo.ase.ecomm.sc.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;

import edu.ucmo.ase.ecomm.sc.domain.AppRoleEnum;

@Scope("session")
public class SessionModel {
	
	private AppRoleEnum appRole;
	
	private HeaderModel headerModel;
	private ShoppingCartListModel shoppingCartListModel;
	private boolean userLoggedIn = false;
	private ProductModel selectedProductDetails;
	private String addToCartRequestPage;
	private boolean checkOutAfterLogIn;
	private boolean saveScAfterLogin;
	private PaymentModel paymentModel;
	
	private CustomerModel customerModel;
	private ShoppingCartModel editSCModel;
	private boolean editSC = false;
	
	private List<ProductModel> searchResultPMs;
	
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

	public AppRoleEnum getAppRole() {
		return appRole;
	}

	public void setAppRole(AppRoleEnum appRole) {
		this.appRole = appRole;
	}

	public CustomerModel getCustomerModel() {
		return customerModel;
	}

	public void setCustomerModel(CustomerModel customerModel) {
		this.customerModel = customerModel;
	}

	public List<ProductModel> getSearchResultPMs() {
		if(this.searchResultPMs == null)	{
			this.searchResultPMs = new ArrayList<ProductModel>();
		}
		return searchResultPMs;
	}

	public void setSearchResultPMs(List<ProductModel> searchResultPMs) {
		this.searchResultPMs = searchResultPMs;
	}

	public ShoppingCartModel getEditSCModel() {
		return editSCModel;
	}

	public void setEditSCModel(ShoppingCartModel editSCModel) {
		this.editSCModel = editSCModel;
	}

	public boolean isEditSC() {
		return editSC;
	}

	public void setEditSC(boolean editSC) {
		this.editSC = editSC;
	}

	public boolean isSaveScAfterLogin() {
		return saveScAfterLogin;
	}

	public void setSaveScAfterLogin(boolean saveScAfterLogin) {
		this.saveScAfterLogin = saveScAfterLogin;
	}
	
	
}
