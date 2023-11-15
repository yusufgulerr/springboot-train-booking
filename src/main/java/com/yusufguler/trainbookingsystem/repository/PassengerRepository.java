package com.yusufguler.trainbookingsystem.repository;

import com.yusufguler.trainbookingsystem.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Integer> {
}
