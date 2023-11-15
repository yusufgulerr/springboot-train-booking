package com.yusufguler.trainbookingsystem.service.imp;

import com.yusufguler.trainbookingsystem.model.TrainJourney;
import com.yusufguler.trainbookingsystem.repository.TrainJourneyRepository;
import com.yusufguler.trainbookingsystem.service.TrainJourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainJourneyServiceImp implements TrainJourneyService {
    TrainJourneyRepository trainJourneyRepository;
    @Autowired
    public TrainJourneyServiceImp(TrainJourneyRepository trainJourneyRepository) {
        this.trainJourneyRepository = trainJourneyRepository;
    }

    @Override
    public List<TrainJourney> getAll() {
        return trainJourneyRepository.findAll();
    }


}
