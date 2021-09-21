package com.tourApplication.springboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tourApplication.springboot.model.CostMaster;


@Repository
@Transactional
public interface CostRepository extends JpaRepository<CostMaster, Long>{
	
	Optional<CostMaster> findById(Long id);
}
