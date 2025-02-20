package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.Driver;
import com.vaishnavi.cab.booking.service.DriverService;

public class DriverController {
    private DriverService driverService = new DriverService();

    public void registerDriver(Driver driver) {
        driverService.registerDriver(driver);
    }

    public void displayDrivers() {
        driverService.listDrivers();
    }

    public Driver getDriverById(int driverId) {
        return driverService.findDriverById(driverId);
    }
}


