package com.yusufguler.trainbookingsystem.service.imp;

import com.yusufguler.trainbookingsystem.model.Schedule;
import com.yusufguler.trainbookingsystem.repository.ScheduleRepository;
import com.yusufguler.trainbookingsystem.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleServiceImp implements ScheduleService {

    ScheduleRepository scheduleRepository;
    @Autowired
    public ScheduleServiceImp(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    @Override
    public List<Schedule> getAll() {
        return scheduleRepository.findAll();
    }
}
