package edu.ucmo.ase.ecomm.sc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER")
public class Customer extends AbstractCustomer{
	
	@Id
	@Column(name="customer_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator= "customerId_Sequence")
	@SequenceGenerator(name = "customerId_Sequence", sequenceName = "customerId_sequence")
	private Integer customerId;
	@Column(name="fist_name")
	private String firstName;
	@Column(name="middle_name")
	private String middleName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="gender")
	private String gender;
	
	

}
