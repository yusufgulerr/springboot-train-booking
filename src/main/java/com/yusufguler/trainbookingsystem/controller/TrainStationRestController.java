package com.yusufguler.trainbookingsystem.controller;

import com.yusufguler.trainbookingsystem.model.TrainStation;
import com.yusufguler.trainbookingsystem.service.TrainStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/trainStations")
public class TrainStationRestController {

    TrainStationService trainStationService;
    @Autowired
    public TrainStationRestController(TrainStationService trainStationService) {
        this.trainStationService = trainStationService;
    }

    @GetMapping
    public List<TrainStation> getAllTrainStations(){
        return trainStationService.getAll();
    }
}
