package com.interdepartmental.model;

public interface Subject {
    void registerObserver();
    void removeObserver();
    void notifyObserver();
}
