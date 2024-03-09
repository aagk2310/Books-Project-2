package com.sismics.books.core.model.jpa;

public class UserRating implements RatingObserver {
    private Rating rating;

    @Override
    public void updateRating(Rating newRating) {
        this.rating = newRating;

    }
}
