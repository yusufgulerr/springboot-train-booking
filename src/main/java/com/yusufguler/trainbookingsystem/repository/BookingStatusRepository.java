package com.yusufguler.trainbookingsystem.repository;

import com.yusufguler.trainbookingsystem.model.BookingStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingStatusRepository extends JpaRepository<BookingStatus,Integer> {
}
