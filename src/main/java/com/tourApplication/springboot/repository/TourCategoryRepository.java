package com.tourApplication.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tourApplication.springboot.model.TourCategoryMaster;


@Repository
@Transactional
public interface TourCategoryRepository extends JpaRepository<TourCategoryMaster, Long>{
	
	@Query("SELECT t FROM TourCategoryMaster t WHERE subCategoryId LIKE %?1%")
	List<TourCategoryMaster> findAll(String subcatid);
	
	//List<TourCategoryMaster> findBysubCategoryId(String subcatid);
}
