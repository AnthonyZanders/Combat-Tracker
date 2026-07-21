package com.backend.combattracker.controller;

import com.backend.combattracker.entity.TrainingSession;
import com.backend.combattracker.repository.TrainingSessionRepository;
import com.backend.combattracker.service.TrainingSessionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/* the rest controller class handles web requests */
@RestController
/* this will have every endpoint in this class start with /trainingsessions */
@RequestMapping("/trainingsessions")
public class TrainingSessionController {

    /* the service that handles business logic for training sessions, controller has a way to talk to the service.*/
    /* Once a variable gets a value, it can never point to another.*/
    private final TrainingSessionService trainingSessionService;


   /* The constructor receives the TrainingSessionService object spring made and will assign it to the controller so it can handle any incoming requests */
    public TrainingSessionController (TrainingSessionService trainingSessionService){
        this.trainingSessionService = trainingSessionService;

    }

    /* This is used to get all of the current training sessions. At the moment, there's 0 sessions but after creating one, it should appear when running the application. */
    @GetMapping
    public List<TrainingSession> getAllTrainingSessions () {
        return trainingSessionService.getAllTrainingSessions();
    }

    /* This is used to save a new training session. */
    @PostMapping
    public TrainingSession saveTrainingSession ( @RequestBody TrainingSession trainingSession) {
        return trainingSessionService.saveTrainingSession(trainingSession);
    }
}
