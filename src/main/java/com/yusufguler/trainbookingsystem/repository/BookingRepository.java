package com.yusufguler.trainbookingsystem.repository;

import com.yusufguler.trainbookingsystem.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Integer> {
}
