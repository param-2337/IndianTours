package com.tourApplication.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tourApplication.springboot.model.CustomerMaster;

public interface CustomerRepository extends JpaRepository<CustomerMaster, Long> {

}
