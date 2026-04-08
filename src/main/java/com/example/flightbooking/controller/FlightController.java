package com.example.flightbooking.controller;

import com.example.flightbooking.dto.BookingRequest;
import com.example.flightbooking.model.Booking;
import com.example.flightbooking.service.FlightService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/flights")
public class FlightController {

    private final FlightService service;

    public FlightController(FlightService service) {
        this.service = service;
    }

    @PostMapping("/{flightNumber}/book")
    public ResponseEntity<Booking> bookFlight(
            @PathVariable String flightNumber,
            @RequestBody BookingRequest request) {

        Booking booking = service.bookSeat(flightNumber, request.getPassengerName());
        return ResponseEntity.ok(booking);
    }
}