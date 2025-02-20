package com.vaishnavi.cab.booking.repository;

import com.vaishnavi.cab.booking.model.Driver;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class DriverRepository {
    private List<Driver> drivers = new ArrayList<>();

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public List<Driver> getAllDrivers() {
        return drivers;
    }

    public Optional<Driver> getDriverById(int driverId) {
        return drivers.stream().filter(driver -> driver.getDriverId() == driverId).findFirst();
    }
}

