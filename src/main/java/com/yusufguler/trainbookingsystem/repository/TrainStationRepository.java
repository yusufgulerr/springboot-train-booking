package com.yusufguler.trainbookingsystem.repository;

import com.yusufguler.trainbookingsystem.model.TrainStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainStationRepository extends JpaRepository<TrainStation,Integer> {
}
