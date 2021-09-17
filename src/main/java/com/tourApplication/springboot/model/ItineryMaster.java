package com.tourApplication.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItineryMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long itineryId;
	
	private long dayNumber;
	private String itineryDetails;
	
	public long getItineryId() {
		return itineryId;
	}
	public void setItineryId(long itineryId) {
		this.itineryId = itineryId;
	}
	public long getDayNumber() {
		return dayNumber;
	}
	public void setDayNumber(long dayNumber) {
		this.dayNumber = dayNumber;
	}
	public String getItineryDetails() {
		return itineryDetails;
	}
	public void setItineryDetails(String itineryDetails) {
		this.itineryDetails = itineryDetails;
	}
	
	
}
