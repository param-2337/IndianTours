package com.tourApplication.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tourApplication.springboot.model.SignupMaster;

public interface SignUpRepository extends JpaRepository<SignupMaster, Long>{
	
	@Query("SELECT s FROM SignupMaster s WHERE s.userName LIKE %?1%")
	List<SignupMaster> findAll(String username);

}
