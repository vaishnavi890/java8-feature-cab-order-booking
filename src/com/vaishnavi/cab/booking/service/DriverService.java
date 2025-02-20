package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.Driver;
import com.vaishnavi.cab.booking.repository.DriverRepository;

public class DriverService {
    private DriverRepository driverRepository = new DriverRepository();

    public void registerDriver(Driver driver) {
        driverRepository.addDriver(driver);
    }

    public void listDrivers() {
        driverRepository.getAllDrivers().forEach(driver -> System.out.println(driver.getName()));
    }

    public Driver findDriverById(int driverId) {
        return driverRepository.getDriverById(driverId).orElse(null);
    }
}

