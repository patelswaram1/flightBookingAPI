package com.example.flightbooking.exception;

public class FlightFullException extends RuntimeException {
    public FlightFullException(String message) {
        super(message);
    }
}