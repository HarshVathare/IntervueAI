package com.code.Moch_Interview_Platform.IntervueAI.Repository;

import com.code.Moch_Interview_Platform.IntervueAI.Entity.InterviewSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterviewSessionRepository extends JpaRepository<InterviewSession, Long> {
}