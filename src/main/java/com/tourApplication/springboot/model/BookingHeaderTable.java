package com.tourApplication.springboot.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class BookingHeaderTable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookingId;
	private String bookingType;
	private long numberOfPass;
	private double tourAmount;
	private double taxes;
	private double totalAmount;
	
	
	@OneToMany(targetEntity = PassengerTable.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "booking_id", referencedColumnName = "bookingId")
	private List<PassengerTable> passengers;
	
	@OneToOne
	@JoinColumn(name = "customer_id", referencedColumnName = "customerId")
	private CustomerMaster customer;
	
	
	@OneToOne
	@JoinColumn(name = "departure_id", referencedColumnName = "departureId")
	private DateMaster date;
	
	public long getBookingId() {
		return bookingId;
	}
	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}
	public String getBookingType() {
		return bookingType;
	}
	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}
	public long getNumberOfPass() {
		return numberOfPass;
	}
	public void setNumberOfPass(long numberOfPass) {
		this.numberOfPass = numberOfPass;
	}
	public double getTourAmount() {
		return tourAmount;
	}
	public void setTourAmount(double tourAmount) {
		this.tourAmount = tourAmount;
	}
	public double getTaxes() {
		return taxes;
	}
	public void setTaxes(double taxes) {
		this.taxes = taxes;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public List<PassengerTable> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<PassengerTable> passengers) {
		this.passengers = passengers;
	}
	public CustomerMaster getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerMaster customer) {
		this.customer = customer;
	}
	public DateMaster getDate() {
		return date;
	}
	public void setDate(DateMaster date) {
		this.date = date;
	}
	
}
