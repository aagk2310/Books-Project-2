package com.sismics.books.core.model.jpa;

// Subject interface
public interface BookSubject {
    void registerObserver(RatingObserver observer);
    void removeObserver(RatingObserver observer);
    void notifyObservers();
}