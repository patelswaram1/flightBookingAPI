package com.example.flightbooking.model;

import java.util.UUID;

public class Booking {
    private String id;
    private String passengerName;
    private String flightNumber;

    public Booking(String passengerName, String flightNumber) {
        this.id = UUID.randomUUID().toString();
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
    }

    public String getId() { return id; }
    public String getPassengerName() { return passengerName; }
    public String getFlightNumber() { return flightNumber; }
}