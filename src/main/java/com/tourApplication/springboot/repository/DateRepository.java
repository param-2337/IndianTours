package com.tourApplication.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tourApplication.springboot.model.DateMaster;

@Repository
@Transactional
public interface DateRepository extends JpaRepository<DateMaster, Long> {

}
