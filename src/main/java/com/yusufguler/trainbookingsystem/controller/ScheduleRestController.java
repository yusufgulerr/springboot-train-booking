package com.yusufguler.trainbookingsystem.controller;

import com.yusufguler.trainbookingsystem.model.Schedule;
import com.yusufguler.trainbookingsystem.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/schedules")
public class ScheduleRestController {

    ScheduleService scheduleService;
    @Autowired
    public ScheduleRestController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @GetMapping
    public List<Schedule> getAllSchedules(){
        return scheduleService.getAll();
    }
}
