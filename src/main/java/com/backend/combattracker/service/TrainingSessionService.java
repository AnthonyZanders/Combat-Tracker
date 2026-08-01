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

    // This is for the GET and POST requests to the database. The controller handles the web requests and the service handles the business logic.
    public List<TrainingSession> getAllTrainingSessions() {
        return repository.findAll();
    }

    public TrainingSession saveTrainingSession(TrainingSession session) {
        return repository.save(session);
    }

    //Method that will be used to edit users training sessions if sessions are not correct.
    public void editTrainingSession(Long id, TrainingSession updateSession){
        TrainingSession existingSession = repository.findById(id).orElseThrow(() -> new RuntimeException ("Cannot find the typed out id:" + id));

        existingSession.setMartialArt(updateSession.getMartialArt());
        existingSession.setTrainingDate(updateSession.getTrainingDate());
        existingSession.setDuration(updateSession.getDuration());
        existingSession.setTechniqueWorkedOn(updateSession.getTechniqueWorkedOn());
        existingSession.setNotes(updateSession.getNotes());

        repository.save(existingSession);
    }

    public void deleteTrainingSession(Long id){
        repository.deleteById(id);
    }



}