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

import com.tourApplication.springboot.model.DateMaster;
import com.tourApplication.springboot.services.TourManager;


@RestController
@CrossOrigin
@RequestMapping("/date/")
public class DateController {
	
	@Autowired
	private TourManager tourManager;

	@GetMapping("dates")
	public List<DateMaster> getDates() {
		List<DateMaster> datelist = tourManager.getDates();
		return datelist;
	}

	@PostMapping("adddates")
	public void createDate(@RequestBody DateMaster date) {
		tourManager.addDate(date);
	}

	@DeleteMapping("/date/{id}")
	public void deleteDate(@PathVariable Long id) {
		tourManager.deleteDate(id);
	}
	
	@PutMapping("updatedate")
	public void updateDate(@RequestBody DateMaster date) {
		tourManager.updateDate(date);
	}
	
	@GetMapping("/date/{id}")
	public Optional<DateMaster> getDateByID(@PathVariable Long id) {
		return tourManager.getDateByID(id);
	}

}
