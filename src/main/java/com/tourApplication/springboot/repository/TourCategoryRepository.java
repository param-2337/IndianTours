package com.tourApplication.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tourApplication.springboot.model.TourCategoryMaster;

@Repository
@Transactional
public interface TourCategoryRepository extends JpaRepository<TourCategoryMaster, Long> {

	@Query("SELECT t FROM TourCategoryMaster t WHERE subCategoryId LIKE %?1%")
	List<TourCategoryMaster> findAll(String subcatid);

	// List<TourCategoryMaster> findBysubCategoryId(String subcatid);

	@Query("SELECT t FROM TourCategoryMaster t WHERE t.categoryName LIKE %?1% AND t.flag = 1")
	List<TourCategoryMaster> findByCategoryName(String searchValue);

//	@Query("SELECT t FROM TourCategoryMaster t WHERE t.categoryMasterId = ANY(SELECT c.categoryMasterId FROM costMaster c WHERE c.cost LIKE '?1'")

	@Query(value = "SELECT * FROM tour_category_master t, cost_master c WHERE t.category_master_id = c.category_master_id AND c.cost = ?1", nativeQuery = true)
	List<TourCategoryMaster> findByCostCategoryName(Long price);
	
	@Query(value="SELECT * FROM tour_category_master t, date_master d WHERE t.category_master_id = d.category_master_id AND d.departure_date LIKE '%-08-%'", nativeQuery = true)
	List<TourCategoryMaster> findByDateCategoryName(String searchMonth);
}
