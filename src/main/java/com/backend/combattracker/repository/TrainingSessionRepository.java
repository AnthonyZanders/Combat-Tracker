package com.backend.combattracker.repository;
import com.backend.combattracker.entity.TrainingSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingSessionRepository
    extends JpaRepository<TrainingSession, Long> {

    }


