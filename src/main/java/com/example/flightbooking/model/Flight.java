package com.example.flightbooking.model;

public class Flight {
    private String flightNumber;
    private int capacity;
    private int bookedSeats;

    public Flight(String flightNumber, int capacity) {
        this.flightNumber = flightNumber;
        this.capacity = capacity;
        this.bookedSeats = 0;
    }

    public String getFlightNumber() { return flightNumber; }
    public int getCapacity() { return capacity; }
    public int getBookedSeats() { return bookedSeats; }

    public void incrementSeats() {
        this.bookedSeats++;
    }
}