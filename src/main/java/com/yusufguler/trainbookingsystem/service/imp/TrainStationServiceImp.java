package com.yusufguler.trainbookingsystem.service.imp;

import com.yusufguler.trainbookingsystem.model.TrainStation;
import com.yusufguler.trainbookingsystem.repository.TrainStationRepository;
import com.yusufguler.trainbookingsystem.service.TrainStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainStationServiceImp implements TrainStationService {
    TrainStationRepository trainStationRepository;
    @Autowired
    public TrainStationServiceImp(TrainStationRepository trainStationRepository) {
        this.trainStationRepository = trainStationRepository;
    }

    @Override
    public List<TrainStation> getAll() {
        return trainStationRepository.findAll();
    }
}
