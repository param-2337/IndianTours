package com.tourApplication.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tourApplication.springboot.model.SignupMaster;


@Repository
@Transactional
public interface SignUpRepository extends JpaRepository<SignupMaster, Long>{
	
	@Query("SELECT s FROM SignupMaster s WHERE s.userName LIKE %?1%")
	List<SignupMaster> findAll(String username);

}
