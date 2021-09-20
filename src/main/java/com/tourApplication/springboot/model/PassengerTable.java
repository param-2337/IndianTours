package com.tourApplication.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PassengerTable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long passengerId;
	
	private String passengerName;
	private String passengerAge;
	private String passengerType;
	private double passengerAmount;
	private String passengerGender;
	
	
	public long getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(long passengerId) {
		this.passengerId = passengerId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(String passengerAge) {
		this.passengerAge = passengerAge;
	}
	public String getPassengerType() {
		return passengerType;
	}
	public void setPassengerType(String passengerType) {
		this.passengerType = passengerType;
	}
	public double getPassengerAmount() {
		return passengerAmount;
	}
	public void setPassengerAmount(double passengerAmount) {
		this.passengerAmount = passengerAmount;
	}
	public String getPassengerGender() {
		return passengerGender;
	}
	public void setPassengerGender(String passengerGender) {
		this.passengerGender = passengerGender;
	}
}
