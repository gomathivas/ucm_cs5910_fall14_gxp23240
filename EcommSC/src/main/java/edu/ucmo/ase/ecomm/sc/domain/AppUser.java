package edu.ucmo.ase.ecomm.sc.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.websocket.ClientEndpoint;

/**
 * Entity bean with JPA annotations Hibernate provides JPA implementation
 * 
 * @author gomathi
 *
 */
@Entity
@Table(name = "APP_USER")
public class AppUser {

	@Id
	@Column(name = "APP_USER_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "app_user_id_Sequence")
	@SequenceGenerator(name = "app_user_id_Sequence", sequenceName = "app_user_id_sequence")
	private Integer appUserId;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "MIDDLE_NAME")
	private String middleName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "PHONE_NUMBER")
	private String phNo;

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "APP_USER_ROLE", joinColumns = { @JoinColumn(name = "APP_USER_ID") }, inverseJoinColumns = { @JoinColumn(name = "APP_ROLE_ID") })
	private Set<AppRole> appRoles = new HashSet<AppRole>();

	@OneToMany(mappedBy = "appUser")
	private Set<Address> addresses = new HashSet<Address>();

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAppUserId() {
		return appUserId;
	}

	public void setAppUserId(Integer appUserId) {
		this.appUserId = appUserId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Set<AppRole> getAppRoles() {
		return appRoles;
	}

	public void setAppRoles(Set<AppRole> appRoles) {
		this.appRoles = appRoles;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AppUser [appUserId=").append(appUserId)
				.append(", firstName=").append(firstName)
				.append(", middleName=").append(middleName)
				.append(", lastName=").append(lastName).append(", gender=")
				.append(gender).append(", userName=").append(userName)
				.append(", password=").append(password).append(", appRoles=")
				.append("]");
		return builder.toString();
	}

}
