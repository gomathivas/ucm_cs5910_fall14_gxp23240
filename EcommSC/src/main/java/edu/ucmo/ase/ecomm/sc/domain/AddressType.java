package edu.ucmo.ase.ecomm.sc.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS_TYPE")
public class AddressType {
	
	@Id
	@Column(name = "ADDRESS_TYPE_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_type_Sequence")
	@SequenceGenerator(name = "address_type_Sequence", sequenceName = "address_type_Sequence")
	private Integer addressTypeId;
	
	@Column(name = "ADDRESS_TYPE_CODE")
	private String addressTypeCode;
	
	@Column(name = "ADDRESS_TYPE_DESCPRIPTION")
	private String addressTypeDesc;

	public Integer getAddressTypeId() {
		return addressTypeId;
	}

/*	@OneToMany(mappedBy="addressType")
	private Set<Address> addresses = new HashSet<Address>();*/
	
	public void setAddressTypeId(Integer addressTypeId) {
		this.addressTypeId = addressTypeId;
	}

	public String getAddressTypeCode() {
		return addressTypeCode;
	}

	public void setAddressTypeCode(String addressTypeCode) {
		this.addressTypeCode = addressTypeCode;
	}

	public String getAddressTypeDesc() {
		return addressTypeDesc;
	}

	public void setAddressTypeDesc(String addressTypeDesc) {
		this.addressTypeDesc = addressTypeDesc;
	}

/*	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}*/

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AddressType [addressTypeId=").append(addressTypeId)
				.append(", addressTypeCode=").append(addressTypeCode)
				.append(", addressTypeDesc=").append(addressTypeDesc)
				.append("]");
		return builder.toString();
	}
	
	
}
