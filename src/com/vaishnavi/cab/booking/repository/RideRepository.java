package com.vaishnavi.cab.booking.repository;

import com.vaishnavi.cab.booking.model.Ride;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class RideRepository {
    private List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {
        rides.add(ride);
    }

    public List<Ride> getAllRides() {
        return rides;
    }

    public Optional<Ride> getRideById(int rideId) {
        return rides.stream().filter(ride -> ride.getRideId() == rideId).findFirst();
    }
}
