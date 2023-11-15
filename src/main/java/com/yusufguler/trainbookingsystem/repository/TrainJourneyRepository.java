package com.yusufguler.trainbookingsystem.repository;

import com.yusufguler.trainbookingsystem.model.TrainJourney;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainJourneyRepository extends JpaRepository<TrainJourney,Integer> {
}
