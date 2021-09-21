package com.tourApplication.springboot.controller;

import java.util.Iterator;
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
	
	@GetMapping("userbyname/{username}/{password}")
	public boolean getUserByUsername(@PathVariable String username, @PathVariable String password) {
		List<SignupMaster> users = tourmanage.getUser(username);
		Iterator<SignupMaster> itr = users.iterator();
		boolean var = false;
		String pass1 = password;
		while(itr.hasNext())
		{
			SignupMaster user = itr.next();
			String pass = user.getPassword();
			if(pass1.equals(pass)) {
				var = true;
				break;
			} 
		}
		return var;
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
