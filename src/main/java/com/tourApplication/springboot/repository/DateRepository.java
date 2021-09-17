package com.tourApplication.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tourApplication.springboot.model.DateMaster;

public interface DateRepository extends JpaRepository<DateMaster, Long> {

}
