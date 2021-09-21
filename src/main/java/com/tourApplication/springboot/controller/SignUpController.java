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

import com.tourApplication.springboot.model.SignupMaster;
import com.tourApplication.springboot.services.TourManager;


@RestController
@CrossOrigin
@RequestMapping("/signin/")
public class SignUpController {

	@Autowired
	private TourManager tourmanage;
	
	@GetMapping("users")
	public List<SignupMaster> getUserByUsername() {
		List<SignupMaster> allUsers = tourmanage.getUsers();
		return allUsers;
	}
	
	@PostMapping("user")
	public SignupMaster createUserAccount(@RequestBody SignupMaster user) {
		tourmanage.saveNewUser(user);
		return user;
	}
	
	@GetMapping("userbyname/{username}")
	public List<SignupMaster> getUserByUsername(@PathVariable String username) {
		List<SignupMaster> users = tourmanage.getUser(username);
		return users;
	}
	
	@PutMapping("updateUsername")
	public Long updateUsername(@RequestBody SignupMaster user) {
		Long id = tourmanage.updateUsername(user);
		return id;
	}
	
	@DeleteMapping("deleteUsername/{id}")
	public void deleteUsername(@PathVariable Long id) {
		tourmanage.deleteUsername(id);
	}
}
