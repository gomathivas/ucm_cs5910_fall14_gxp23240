package edu.ucmo.ase.ecomm.sc.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS")
public class Address {
	
	@Id
	@Column(name = "ADDRESS_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_id_Sequence")
	@SequenceGenerator(name = "address_id_Sequence", sequenceName = "address_id_Sequence")
	private Integer addressId;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "APP_USER_ID")
	private AppUser appUser;
	
	@Column(name = "ADDRESS_LINE_1")
	private String addressLineOne;
	
	@Column(name = "ADDREESS_LINE_2")
	private String addressLineTwo;
	
	@Column(name = "CITY")
	private String city;
	
	@Column(name = "COUNTRY")
	private String country;
	
	@Column(name = "ZIPCODE")
	private String zipCode;
	
	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "ADDRESS_TYPE_ID")
	private AddressType addressType;
	
	@Column(name = "STATE")
	private String state;

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public AppUser getAppUser() {
		return appUser;
	}

	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}

	public String getAddressLineOne() {
		return addressLineOne;
	}

	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}

	public String getAddressLineTwo() {
		return addressLineTwo;
	}

	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public AddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [addressId=").append(addressId)
				.append(", appUser=").append(appUser)
				.append(", addressLineOne=").append(addressLineOne)
				.append(", addressLineTwo=").append(addressLineTwo)
				.append(", city=").append(city).append(", country=")
				.append(country).append(", zipCode=").append(zipCode)
				.append(", addressType=").append(addressType)
				.append(", state=").append(state).append("]");
		return builder.toString();
	}
	
	
	
}
