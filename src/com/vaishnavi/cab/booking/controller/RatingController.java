package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.Rating;
import com.vaishnavi.cab.booking.service.RatingService;

public class RatingController {
    private RatingService ratingService = new RatingService();

    public void submitRating(Rating rating) {
        ratingService.submitRating(rating);
    }

    public void displayRatings() {
        ratingService.listRatings();
    }

    public Rating getRatingById(int ratingId) {
        return ratingService.findRatingById(ratingId);
    }
}

