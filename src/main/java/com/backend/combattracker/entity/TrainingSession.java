package com.backend.combattracker.entity;
import jakarta.persistence.*;

@Entity
public class TrainingSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date;
    private String martialArt;
    private int duration;
    private String notes;

    public TrainingSession() {
    }

    public Long getId () {
        return id;
    }

    public String getDate () {
        return date;
    }
    public void setDate (String date) {
        this.date = date;
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
    public String getNotes () {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
}
