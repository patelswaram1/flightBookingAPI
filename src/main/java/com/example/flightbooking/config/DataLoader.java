package com.example.flightbooking.config;

import com.example.flightbooking.model.Flight;
import com.example.flightbooking.service.FlightService;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class DataLoader {

    private final FlightService service;

    public DataLoader(FlightService service) {
        this.service = service;
    }

    @PostConstruct
    public void loadData() {
        service.getFlights().put("AI101", new Flight("AI101", 2));
        service.getFlights().put("BA202", new Flight("BA202", 3));
    }
}