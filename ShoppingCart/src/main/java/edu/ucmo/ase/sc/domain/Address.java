package edu.ucmo.ase.sc.domain;

// default package
// Generated Oct 14, 2014 8:17:09 PM by Hibernate Tools 4.0.0

import java.math.BigDecimal;

/**
 * Address generated by hbm2java
 */
public class Address implements java.io.Serializable {

	private BigDecimal addressId;
	private AddreessType addreessType;
	private AppUser appUser;
	private String addressLine1;
	private String addreessLine2;
	private String city;
	private String country;
	private String zipcode;

	public Address() {
	}

	public Address(BigDecimal addressId, AddreessType addreessType,
			AppUser appUser) {
		this.addressId = addressId;
		this.addreessType = addreessType;
		this.appUser = appUser;
	}

	public Address(BigDecimal addressId, AddreessType addreessType,
			AppUser appUser, String addressLine1, String addreessLine2,
			String city, String country, String zipcode) {
		this.addressId = addressId;
		this.addreessType = addreessType;
		this.appUser = appUser;
		this.addressLine1 = addressLine1;
		this.addreessLine2 = addreessLine2;
		this.city = city;
		this.country = country;
		this.zipcode = zipcode;
	}

	public BigDecimal getAddressId() {
		return this.addressId;
	}

	public void setAddressId(BigDecimal addressId) {
		this.addressId = addressId;
	}

	public AddreessType getAddreessType() {
		return this.addreessType;
	}

	public void setAddreessType(AddreessType addreessType) {
		this.addreessType = addreessType;
	}

	public AppUser getAppUser() {
		return this.appUser;
	}

	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}

	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddreessLine2() {
		return this.addreessLine2;
	}

	public void setAddreessLine2(String addreessLine2) {
		this.addreessLine2 = addreessLine2;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
