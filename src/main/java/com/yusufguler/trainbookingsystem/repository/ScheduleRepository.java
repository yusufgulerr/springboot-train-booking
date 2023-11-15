package com.yusufguler.trainbookingsystem.repository;

import com.yusufguler.trainbookingsystem.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule,Integer> {
}
