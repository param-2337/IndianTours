package com.tourApplication.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tourApplication.springboot.model.TourCategoryMaster;


@Repository
public interface TourCategoryRepository extends JpaRepository<TourCategoryMaster, Long>{
	
	@Query("SELECT categoryName FROM TourCategoryMaster WHERE subCategoryId LIKE %?1%")
	List<String> findAll(String subcatid);
	
	//List<TourCategoryMaster> findBysubCategoryId(String subcatid);
}
