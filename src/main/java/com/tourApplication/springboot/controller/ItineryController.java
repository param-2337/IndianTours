package com.tourApplication.springboot.controller;

import java.util.List;

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

import com.tourApplication.springboot.model.ItineryMaster;
import com.tourApplication.springboot.services.TourManager;

@RestController
@CrossOrigin
@RequestMapping("/itinery/")
public class ItineryController {
	
	@Autowired
	private TourManager tourManager;

	@GetMapping("allItinery")
	public List<ItineryMaster> getRecords() {
		List<ItineryMaster> mylist = tourManager.getItinery();
		return mylist;
	}

	@PostMapping("addItinery")
	public void createItinery(@RequestBody ItineryMaster itinery) {
		tourManager.addItinery(itinery);
	}

	@PutMapping("updateItinery")
	public void updateItinery(@RequestBody ItineryMaster itinery) {
		tourManager.updateItineryRecord(itinery);
	}
	
	@DeleteMapping("deleteItinery/{id}")
	public void deleteItinery(@PathVariable Long id) {
		tourManager.deleteItinery(id);
	}


}
