package com.yusufguler.trainbookingsystem.repository;

import com.yusufguler.trainbookingsystem.model.CarriageClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarriageClassRepository extends JpaRepository<CarriageClass,Integer> {
}
