package com.sts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String Name;

		@Column(name = "address")
	private String address;
	
	@Column(name = "email_id")
	private String emailId;
	
	@Column(name = "mobile_no")
	private String mobileNo;
	
	@Column(name = "parance_mobile_no")
	private String parance_mobileNo;
	
	@Column(name = "regd_no")
	private String regdNo;
	
	@Column(name = "pick_up_address")
	private String pickUpAddress;
	
	public Student() {
		
	}
	
	public Student(String name, String address, String emailId, String mobileNo, String parance_mobileNo, String regdNo,
			String pickUpAddress) {
		super();
		Name = name;
		this.address = address;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.parance_mobileNo = parance_mobileNo;
		this.regdNo = regdNo;
		this.pickUpAddress = pickUpAddress;
	}
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getParance_mobileNo() {
		return parance_mobileNo;
	}

	public void setParance_mobileNo(String parance_mobileNo) {
		this.parance_mobileNo = parance_mobileNo;
	}

	public String getRegdNo() {
		return regdNo;
	}

	public void setRegdNo(String regdNo) {
		this.regdNo = regdNo;
	}

	public String getPickUpAddress() {
		return pickUpAddress;
	}

	public void setPickUpAddress(String pickUpAddress) {
		this.pickUpAddress = pickUpAddress;
	}



}

