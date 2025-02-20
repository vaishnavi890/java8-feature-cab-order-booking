package com.vaishnavi.cab.booking;

import com.vaishnavi.cab.booking.model.*;
import com.vaishnavi.cab.booking.service.DriverService;
import com.vaishnavi.cab.booking.service.PaymentService;
import com.vaishnavi.cab.booking.service.RatingService;
import com.vaishnavi.cab.booking.service.RideService;

public class CabOrderBooking {
    public static void main(String[] args) {
        DriverService driverService = new DriverService();
        RideService rideService = new RideService();
        PaymentService paymentService = new PaymentService();


        // Adding some drivers
        Driver driver1 = new Driver(1, "John Doe", "john@example.com", "1234567890", "Cab XYZ");
        Driver driver2 = new Driver(2, "Jane Smith", "jane@example.com", "0987654321", "Cab ABC");
        driverService.registerDriver(driver1);
        driverService.registerDriver(driver2);

        // Creating some rides
        Ride ride1 = new Ride(1, 101, 1, "Location A", "Location B", 50.0, "Completed");
        Ride ride2 = new Ride(2, 102, 2, "Location C", "Location D", 75.0, "Completed");
        rideService.createRide(ride1);
        rideService.createRide(ride2);

        // Processing payments
        Payment payment1 = new Payment(1, 1, 101, 50.0, "Credit Card", "Success");
        Payment payment2 = new Payment(2, 2, 102, 75.0, "Debit Card", "Success");
        paymentService.processPayment(payment1);
        paymentService.processPayment(payment2);

        // Submitting ratings
        Rating rating1 = new Rating(1, 1, 101, 1, 5, "Great ride!");
        Rating rating2 = new Rating(2, 2, 102, 2, 4, "Good service!");

        ratingService.submitRating(rating1);
        ratingService.submitRating(rating2);

        // Displaying data
        System.out.println("Drivers:");
        driverService.listDrivers();

        System.out.println("\nRides:");
        rideService.listRides();

        System.out.println("\nPayments:");
        paymentService.listPayments();

        System.out.println("\nRatings:");
        ratingRepository.listRatings();


        // Displaying average rating of a driver
        System.out.println("\nAverage rating for Driver 1: " + rating1.getReview().calculateAverageRating(1));
        System.out.println("Average rating for Driver 2: " + rating2.getReview().calculateAverageRating(2));
    }
}


