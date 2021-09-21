package com.tourApplication.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tourApplication.springboot.model.ItineryMaster;

@Repository
@Transactional
public interface ItineryRepository extends JpaRepository<ItineryMaster, Long>{

}
