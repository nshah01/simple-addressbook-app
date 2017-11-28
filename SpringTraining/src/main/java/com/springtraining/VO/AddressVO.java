package com.springtraining.VO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "addressbook")
public class AddressVO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressId;
	
	public int getAddressId() {
		return addressId;
	}

	
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	@Column(name = "Line1")
	private String line1;
	
	public String getLine1() {
		return line1;
	}

	
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	
	@Column(name = "Line2")
	private String line2;
	
	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}
	
	@Column(name = "zipcode")
	private int zipcode;
	
	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	@Column(name = "firstname")
	private String firstname;
	
	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Column(name = "lastname")
	private String lastname;
	

	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public AddressVO() {
		// TODO Auto-generated constructor stub
		this.addressId = addressId;
		this.line1 = line1;
		this.line2 = line2;
		this.zipcode = zipcode;
		this.firstname = firstname;
		this.lastname = lastname;
	}


	@Override
	public String toString() {
		return "AddressVO [addressId=" + addressId + ", line1=" + line1 + ", line2=" + line2 + ", zipcode=" + zipcode
				+ ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
	
	
	
	
}
