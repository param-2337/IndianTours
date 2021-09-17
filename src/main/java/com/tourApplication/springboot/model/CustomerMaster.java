package com.tourApplication.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class CustomerMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customerId;
	private String customerFirstName;
	private String customerMiddletName;
	private String customerLastName;
	private int customerAge;
	private String customerRoomNumber;
	private String customerBuildingName;
	private String customerStreet;
	private String customerArea;
	private String City;
	private String State;
	private long pinCode;
	private String phoneNumber;
	private String emailAddress;
	private String customerIdProof;
	private String customerIdProofNumber;
	
	
	@OneToOne
	@JoinColumn(name = "login_id", referencedColumnName = "loginId")
	private SignupMaster signinuser;
	
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getCustomerMiddletName() {
		return customerMiddletName;
	}
	public void setCustomerMiddletName(String customerMiddletName) {
		this.customerMiddletName = customerMiddletName;
	}
	public String getCustomerLastName() {
		return customerLastName;
	}
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	public String getCustomerRoomNumber() {
		return customerRoomNumber;
	}
	public void setCustomerRoomNumber(String customerRoomNumber) {
		this.customerRoomNumber = customerRoomNumber;
	}
	public String getCustomerBuildingName() {
		return customerBuildingName;
	}
	public void setCustomerBuildingName(String customerBuildingName) {
		this.customerBuildingName = customerBuildingName;
	}
	public String getCustomerStreet() {
		return customerStreet;
	}
	public void setCustomerStreet(String customerStreet) {
		this.customerStreet = customerStreet;
	}
	public String getCustomerArea() {
		return customerArea;
	}
	public void setCustomerArea(String customerArea) {
		this.customerArea = customerArea;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public long getPinCode() {
		return pinCode;
	}
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getCustomerIdProof() {
		return customerIdProof;
	}
	public void setCustomerIdProof(String customerIdProof) {
		this.customerIdProof = customerIdProof;
	}
	public String getCustomerIdProofNumber() {
		return customerIdProofNumber;
	}
	public void setCustomerIdProofNumber(String customerIdProofNumber) {
		this.customerIdProofNumber = customerIdProofNumber;
	}
	public SignupMaster getSigninuser() {
		return signinuser;
	}
	public void setSigninuser(SignupMaster signinuser) {
		this.signinuser = signinuser;
	}
	
	
}
