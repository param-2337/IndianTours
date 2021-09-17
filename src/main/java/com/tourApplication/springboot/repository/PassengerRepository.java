package com.tourApplication.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tourApplication.springboot.model.PassengerTable;


@Repository
public interface PassengerRepository extends JpaRepository<PassengerTable, Long>{
}
