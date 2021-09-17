package com.tourApplication.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DateMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long departureId;
	private String departureDate;
	private String endDate;
	private int numberOfDays;
	private int passengerLimit;
	private int numberOfPassenger;
	
	
	public long getDepartureId() {
		return departureId;
	}
	public void setDepartureId(long departureId) {
		this.departureId = departureId;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public int getNumberOfDays() {
		return numberOfDays;
	}
	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	public int getPassengerLimit() {
		return passengerLimit;
	}
	public void setPassengerLimit(int passengerLimit) {
		this.passengerLimit = passengerLimit;
	}
	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}
	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}
	
	
}
