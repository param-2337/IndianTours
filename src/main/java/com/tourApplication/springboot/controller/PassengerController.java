package com.tourApplication.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tourApplication.springboot.model.PassengerTable;
import com.tourApplication.springboot.services.TourManager;

@RestController
@CrossOrigin
@RequestMapping("/passenger/")
public class PassengerController {

	@Autowired
	private TourManager tourManager;


	@GetMapping("allpassengers")
	public List<PassengerTable> getPass() {
		List<PassengerTable> passlist = tourManager.getPass();
		return passlist;
	}

	@PostMapping("addpassenger")
	public void createPassenger(@RequestBody PassengerTable pass) {
		tourManager.addPass(pass);
	}

	@GetMapping("/allpassenger/{id}")
	public Optional<PassengerTable> getPassByID(@PathVariable Long id) {
		return tourManager.getPassByID(id);
	}

	@DeleteMapping("/passenger/{id}")
	public void deletePass(@PathVariable Long id) {
		tourManager.deletePass(id);
	}
	// ----End Passenger Table Controller-----
	
	
	@PutMapping("updatepassenger")
	public void updatePassenger(@RequestBody PassengerTable pass) {
		tourManager.updatePass(pass);
	}
}
