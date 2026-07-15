package com.backend.combattracker.entity;
import jakarta.persistence.*;

import java.time.LocalDate;

//@Entity turn this class into a database table
@Entity
public class TrainingSession {
    //Used as a primary key
    @Id
    //MySQl will generate ID's on its own. 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String martialArt;
    private LocalDate trainingDate;
    private int duration;
    private String TechniqueWorkedOn;
    private String notes;

    public TrainingSession() {
    }

    public Long getId () {
        return id;
    }

    public LocalDate getTrainingDate () {
        return trainingDate;
    }public void setTrainingDate (LocalDate trainingDate) {
        this.trainingDate = trainingDate;
    }

    public String getMartialArt () {
        return martialArt;
    }
    public void setMartialArt (String martialArt) {
        this.martialArt = martialArt;
    }
    public int getDuration () {
        return duration;
    }
    public void setDuration (int duration) {
        this.duration = duration;
    }
    public String getTechniqueWorkedOn (){
        return TechniqueWorkedOn;
    }
    public void setTechniqueWorkedOn (String techniqueWorkedOn) {
        this.TechniqueWorkedOn = techniqueWorkedOn;
    }

    public String getNotes () {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
}
