package com.backend.combattracker.exception;

public class TrainingSessionNotFound extends RuntimeException {
    public TrainingSessionNotFound(String message) {
        super(message);
    }
}
