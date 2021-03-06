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

import com.tourApplication.springboot.model.TourCategoryMaster;
import com.tourApplication.springboot.services.TourManager;


@RestController
@CrossOrigin
@RequestMapping("/tourcategory/")
public class TourCategoryController {

	@Autowired
	private TourManager tourManager;

	@GetMapping("records")
	public List<TourCategoryMaster> getRecords() {
		List<TourCategoryMaster> mylist = tourManager.getRecords();
		return mylist;
	}

	@PostMapping("record")
	public void createPackage(@RequestBody TourCategoryMaster tour) {
		tourManager.addTour(tour);
	}

	
	@GetMapping("records/catid/{id}")
	public Optional<TourCategoryMaster> getPackageById(@PathVariable Long id) {
		Optional<TourCategoryMaster> tourObject = tourManager.getRecordById(id);
//				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		return tourObject;
	}
	
	@GetMapping("records/subcatid/{subcatid}")
	public List<TourCategoryMaster> getCategories(@PathVariable String subcatid){
		List<TourCategoryMaster> catlist = tourManager.allCategories(subcatid);
		return catlist;
	}
	
	@PutMapping("records/update")
	public Optional<TourCategoryMaster> updatePackage(@RequestBody TourCategoryMaster tourcatmas) {
		tourManager.updateRecord(tourcatmas);
		return tourManager.getRecordById(tourcatmas.getCategoryMasterId());
	}
	
	@DeleteMapping("deleteRecord/{id}")
	public void deleteRecord(@PathVariable Long id) {
		tourManager.deleteRecord(id);
	}
	
	
	@GetMapping("records/search/{searchValue}")
	public List<TourCategoryMaster> searchList(@PathVariable String searchValue){
		List<TourCategoryMaster> catlist = tourManager.searchList(searchValue);
		System.out.println(catlist);
		return catlist;
	}
	
	
	@GetMapping("records/searchcost/{searchCost}")
	public List<TourCategoryMaster> searchCostList(@PathVariable String searchCost){
		Long price  = Long.parseLong(searchCost);
		List<TourCategoryMaster> catlist = tourManager.searchCostList(price);
		System.out.println(catlist);
		return catlist;
	}
	
	@GetMapping("records/searchmonth/{searchMonth}")
	public List<TourCategoryMaster> searchDateList(@PathVariable String searchMonth){
		System.out.println(searchMonth);
		List<TourCategoryMaster> catlist = tourManager.searchDateList(searchMonth);
		System.out.println(catlist);
		return catlist;
	}
}
