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

import com.tourApplication.springboot.model.CostMaster;
import com.tourApplication.springboot.services.TourManager;


@RestController
@CrossOrigin
@RequestMapping("/cost/")
public class CostController {

	// ----Cost Master Controller-----

	@Autowired
	private TourManager tourManager;

	@GetMapping("cost")
	public List<CostMaster> getCost() {
		List<CostMaster> costlist = tourManager.getCost();
		return costlist;
	}

	@PostMapping("cost")
	public void createCost(@RequestBody CostMaster cost) {
		tourManager.addCost(cost);
	}

	@DeleteMapping("/cost/{id}")
	public void deleteCost(@PathVariable Long id) {
		tourManager.deleteCost(id);
	}
	
	@PutMapping("updateCost")
	public void updateCost(@RequestBody CostMaster cost) {
		tourManager.updateCost(cost);
	}
	
	@GetMapping("/cost/{id}")
	public Optional<CostMaster> getCostByID(@PathVariable Long id) {
		return tourManager.getCostByID(id);
	}
	
	/*
	 * // update employee rest api
	 * 
	 * @PutMapping("/tours/{id}") public ResponseEntity<TourCategoryMaster>
	 * updateTour(@PathVariable Long id,
	 * 
	 * @RequestBody TourCategoryMaster tourDetails) { TourCategoryMaster tours =
	 * tourcategorymasterrepository.findById(id) .orElseThrow(() -> new
	 * ResourceNotFoundException("Tour not exist with id :" + id));
	 * 
	 * tours.setCategoryId(tourDetails.getCategoryId());
	 * tours.setSubCategoryId(tourDetails.getSubCategoryId());
	 * tours.setCategoryName(tourDetails.getCategoryName());
	 * tours.setCategoryImagePath(tourDetails.getCategoryImagePath());
	 * tours.setFlag(tourDetails.getFlag());
	 * 
	 * TourCategoryMaster updatedTour = tourcategorymasterrepository.save(tours);
	 * return ResponseEntity.ok(updatedTour); }
	 */

	/*
	 * @PutMapping("/cost/{id}") public CostMaster updateCost(@RequestBody
	 * CostMaster cost,@PathVariable Long id) { Optional<CostMaster> costs =
	 * costManager.getCostByID(id); costs.setCost(cost.getCost());
	 * costs.setSinglePersonCost(cost.getSinglePersonCost());
	 * costs.setExtraPersonCost(cost.getExtraPersonCost());
	 * costs.setChildWithBedCost(cost.getChildWithBedCost());
	 * costs.setChildWithoutBedCost(cost.getChildWithoutBedCost());
	 * costs.setCostForSharingRoom(cost.getCostForSharingRoom());
	 * costs.setValidFrom(cost.getValidFrom); costs.setValidTo(cost.getValidTo());
	 * 
	 * CostMaster upcost=costManager.addCost(costs); return cost; }
	 */

	// ----End Cost Master Controller-----
}
