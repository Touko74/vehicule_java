package com.example.demo.service;

import com.example.demo.model.Bus;
import com.example.demo.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusService {

    private final BusRepository busRepository;

    @Autowired
    public BusService(BusRepository busRepository){
        this.busRepository = busRepository;
    }

    public Bus create(String nom, float prix){
        Bus bus = new Bus(nom, prix);
        return busRepository.save(bus);
    }
}
