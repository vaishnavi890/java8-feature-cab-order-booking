package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.Rating;
import java.util.List;
import java.util.stream.Collectors;

public class RatingService {
    private RatingRepository ratingRepository = new RatingRepository();

    public void submitRating(Rating rating) {
        ratingRepository.addRating(rating);
    }

    public void listRatings() {
        ratingRepository.getAllRatings().forEach(rating -> System.out.println("Rating: " + rating.getRating()));
    }

    public Rating findRatingById(int ratingId) {
        return ratingRepository.getRatingById(ratingId).orElse(null);
    }

    public double calculateAverageRating(int driverId) {
        List<Rating> driverRatings = ratingRepository.getAllRatings().stream()
                .filter(rating -> rating.getDriverId() == driverId)
                .collect(Collectors.toList());

        return driverRatings.isEmpty() ? 0.0 : driverRatings.stream().mapToDouble(Rating::getRating).average().orElse(0.0);
    }
}

