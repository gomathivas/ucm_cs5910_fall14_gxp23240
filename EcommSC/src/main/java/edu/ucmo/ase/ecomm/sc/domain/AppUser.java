package edu.ucmo.ase.ecomm.sc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author gomathi
 *
 */
@Entity
@Table(name="APP_USER")
public class AppUser {

	@Id
	@Column(name="APP_USER_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator= "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "person_sequence")
	private Integer appUserId;
	
	private String firstName;
	
	private String middleName;
	
	private String lastName;
	
	private String gender;

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


}
