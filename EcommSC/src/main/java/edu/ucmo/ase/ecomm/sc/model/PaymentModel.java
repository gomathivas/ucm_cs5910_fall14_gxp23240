package edu.ucmo.ase.ecomm.sc.model;

import java.util.ArrayList;
import java.util.List;

public class PaymentModel {

	private List<String> cardTypeOptions;
	private String cartType;
	private String cardNumber;
	private String expireMonth;
	private List<String> expireMonthOption;
	private String expireYear;
	private List<String> expireYearOption;
	private String securityCode;
	
	private String nameOnCard;
	private String email;
	private String phNo;
	private Address billingAddress;
	
	private Address shippingAddress;
	
	public List<String> getCardTypeOptions() {
		if(this.cardTypeOptions == null)	{
			this.cardTypeOptions = new ArrayList<String>();
			this.cardTypeOptions.add("Visa");
			this.cardTypeOptions.add("Master Card");
			this.cardTypeOptions.add("Discover");
		}
		
		return cardTypeOptions;
	}

	public void setCardTypeOptions(List<String> cardTypeOptions) {
		this.cardTypeOptions = cardTypeOptions;
	}

	public String getCartType() {
		return cartType;
	}

	public void setCartType(String cartType) {
		this.cartType = cartType;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpireMonth() {
		return expireMonth;
	}

	public void setExpireMonth(String expireMonth) {
		this.expireMonth = expireMonth;
	}

	public List<String> getExpireMonthOption() {
		if(this.expireMonthOption == null)	{
			this.expireMonthOption = new ArrayList<String>();
			this.expireMonthOption.add("01 Jan");
			this.expireMonthOption.add("02 Feb");
			this.expireMonthOption.add("03 Mar");
			this.expireMonthOption.add("04 Apr");
			this.expireMonthOption.add("05 May");
			this.expireMonthOption.add("06 Jun");
			this.expireMonthOption.add("07 Jul");
			this.expireMonthOption.add("08 Aug");
			this.expireMonthOption.add("09 Sep");
			this.expireMonthOption.add("10 Oct");
			this.expireMonthOption.add("11 Nov");
			this.expireMonthOption.add("12 Dec");
		}
		return expireMonthOption;
	}

	public void setExpireMonthOption(List<String> expireMonthOption) {
		this.expireMonthOption = expireMonthOption;
	}

	public String getExpireYear() {
		return expireYear;
	}

	public void setExpireYear(String expireYear) {
		this.expireYear = expireYear;
	}

	public List<String> getExpireYearOption() {
		return expireYearOption;
	}

	public void setExpireYearOption(List<String> expireYearOption) {
		if(this.expireYearOption == null)	{
			this.expireYearOption = new ArrayList<String>();
			this.expireYearOption.add("2014");
			this.expireYearOption.add("2015");
			this.expireYearOption.add("2016");
			this.expireYearOption.add("2017");
			this.expireYearOption.add("2018");
			this.expireYearOption.add("2019");
			this.expireYearOption.add("2020");
			this.expireYearOption.add("2021");
			this.expireYearOption.add("2022");
			this.expireYearOption.add("2023");
			this.expireYearOption.add("2024");
			this.expireYearOption.add("2025");
		}
		this.expireYearOption = expireYearOption;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	public Address getBillingAddress() {
		if(this.billingAddress == null)	{
			this.billingAddress = new Address();
		}
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Address getShippingAddress() {
		if(this.shippingAddress == null)	{
			this.shippingAddress = new Address();
		}
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}


}
