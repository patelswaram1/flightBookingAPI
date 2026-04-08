package com.example.flightbooking.service;

import com.example.flightbooking.model.*;
import com.example.flightbooking.exception.*;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class FlightService {

    private final Map<String, Flight> flights = new ConcurrentHashMap<>();
    private final List<Booking> bookings = Collections.synchronizedList(new ArrayList<>());

    public Map<String, Flight> getFlights() {
        return flights;
    }

    public synchronized Booking bookSeat(String flightNumber, String passengerName) {
        Flight flight = flights.get(flightNumber);

        if (flight == null) {
            throw new FlightNotFoundException("Flight not found");
        }

        if (flight.getBookedSeats() >= flight.getCapacity()) {
            throw new FlightFullException("Flight is full");
        }

        flight.incrementSeats();

        Booking booking = new Booking(passengerName, flightNumber);
        bookings.add(booking);

        return booking;
    }
}