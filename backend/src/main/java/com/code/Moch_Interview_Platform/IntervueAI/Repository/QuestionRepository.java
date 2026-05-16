package com.code.Moch_Interview_Platform.IntervueAI.Repository;

import com.code.Moch_Interview_Platform.IntervueAI.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}