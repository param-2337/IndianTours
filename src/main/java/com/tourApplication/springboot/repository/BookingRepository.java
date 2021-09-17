package com.tourApplication.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tourApplication.springboot.model.BookingHeaderTable;

public interface BookingRepository extends JpaRepository<BookingHeaderTable, Long> {

}
