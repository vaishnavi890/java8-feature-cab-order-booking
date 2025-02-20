package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.Ride;
import com.vaishnavi.cab.booking.repository.RideRepository;

public class RideService {
    private RideRepository rideRepository = new RideRepository();

    public void createRide(Ride ride) {
        rideRepository.addRide(ride);
    }

    public void listRides() {
        rideRepository.getAllRides().forEach(ride -> System.out.println("Ride ID: " + ride.getRideId()));
    }

    public Ride findRideById(int rideId) {
        return rideRepository.getRideById(rideId).orElse(null);
    }
}
