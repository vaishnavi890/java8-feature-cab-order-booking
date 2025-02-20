package com.vaishnavi.cab.booking.repository;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class ratingRepository {
    private List<Rating> ratings = new ArrayList<>();

    public void addRating(Rating rating) {
        ratings.add(rating);
    }

    public List<Rating> getAllRatings() {
        return ratings;
    }

    public Optional<Rating> getRatingById(int ratingId) {
        return ratings.stream().filter(rating -> rating.getRatingId() == ratingId).findFirst();
    }
}
