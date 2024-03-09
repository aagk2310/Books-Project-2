package com.sismics.books.core.model.jpa;

// Rating class to encapsulate user ID and rating value
public class Rating {
    private User user;
    private float rating;

    public Rating(User user, float rating) {
        this.user = user;
        this.rating = rating;
    }

    // Getters and Setters
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}



