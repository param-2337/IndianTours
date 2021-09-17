package com.tourApplication.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tourApplication.springboot.model.ItineryMaster;

@Repository
public interface ItineryRepository extends JpaRepository<ItineryMaster, Long>{

}
