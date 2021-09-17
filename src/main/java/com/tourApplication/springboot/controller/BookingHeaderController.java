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

import com.tourApplication.springboot.model.BookingHeaderTable;
import com.tourApplication.springboot.services.TourManager;

@RestController
@CrossOrigin
@RequestMapping("/bookhead/")
public class BookingHeaderController {
	
	@Autowired
	private TourManager tourManager;

	@GetMapping("/getbooking")
	public List<BookingHeaderTable> getBookingRecord() {
		List<BookingHeaderTable> costlist = tourManager.getRecord();
		return costlist;
	}

	@PostMapping("/addbooking")
	public void createBookingRecord(@RequestBody BookingHeaderTable rec) {
		tourManager.addBookRecord(rec);
	}

	@DeleteMapping("/deletebooking/{id}")
	public void deleteBookingRecord(@PathVariable Long id) {
		tourManager.deleteBookRecord(id);
	}
	
	@PutMapping("updatebooking")
	public void updateBookingRecord(@RequestBody BookingHeaderTable rec) {
		tourManager.updateBookRecord(rec);
	}

}
