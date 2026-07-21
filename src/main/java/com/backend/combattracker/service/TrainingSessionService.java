package com.backend.combattracker.service;

import com.backend.combattracker.entity.TrainingSession;
import com.backend.combattracker.repository.TrainingSessionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingSessionService {

    private final TrainingSessionRepository repository;

    public TrainingSessionService(TrainingSessionRepository repository) {
        this.repository = repository;
    }

    public List<TrainingSession> getAllTrainingSessions() {
        return repository.findAll();
    }

    public TrainingSession saveTrainingSession(TrainingSession session) {
        return repository.save(session);
    }
}