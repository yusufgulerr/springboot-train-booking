package com.yusufguler.trainbookingsystem.controller;

import com.yusufguler.trainbookingsystem.model.TrainJourney;
import com.yusufguler.trainbookingsystem.service.TrainJourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/trainJourneys")
public class TrainJourneyRestController {

    TrainJourneyService trainJourneyService;
    @Autowired
    public TrainJourneyRestController(TrainJourneyService trainJourneyService) {
        this.trainJourneyService = trainJourneyService;
    }

    @GetMapping
    public List<TrainJourney> getAllTrainJourneys(){
        return trainJourneyService.getAll();
    }
}
