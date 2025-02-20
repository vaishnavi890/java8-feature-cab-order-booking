package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.Ride;
import com.vaishnavi.cab.booking.service.RideService;

public class RideController {
    private RideService rideService = new RideService();

    public void createRide(Ride ride) {
        rideService.createRide(ride);
    }

    public void displayRides() {
        rideService.listRides();
    }

    public Ride getRideById(int rideId) {
        return rideService.findRideById(rideId);
    }
}

