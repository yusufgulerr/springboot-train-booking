package com.yusufguler.trainbookingsystem.repository;

import com.yusufguler.trainbookingsystem.model.CarriagePrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarriagePriceRepository extends JpaRepository<CarriagePrice,Integer> {
}
