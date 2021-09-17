package com.tourApplication.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tourApplication.springboot.model.CustomerMaster;
import com.tourApplication.springboot.services.TourManager;

public class CustomerController {

	
	@Autowired
	private TourManager tourManager;

	@GetMapping("customers")
	public List<CustomerMaster> getCustomers() {
		List<CustomerMaster> costlist = tourManager.getCustomers();
		return costlist;
	}

	@PostMapping("addcustomer")
	public void createCustomer(@RequestBody CustomerMaster cust) {
		tourManager.addCustomer(cust);
	}

	@DeleteMapping("/customer/{id}")
	public void deleteCustomer(@PathVariable Long id) {
		tourManager.deleteCustomer(id);
	}
	
	@PutMapping("updateCustomer")
	public void updateCustomer(@RequestBody CustomerMaster cust) {
		tourManager.updateCustomer(cust);
	}
	
	@GetMapping("/customer/{id}")
	public Optional<CustomerMaster> getCustomerByID(@PathVariable Long id) {
		return tourManager.getCustomerByID(id);
	}
}
