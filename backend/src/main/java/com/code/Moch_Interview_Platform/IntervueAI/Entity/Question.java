package com.code.Moch_Interview_Platform.IntervueAI.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "questions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String questionText;

    private String questionType;

    private String difficultyLevel;

    @ManyToOne
    @JoinColumn(name = "session_Id")
    private InterviewSession session;

    @OneToOne(mappedBy = "question")
    private Answer answer;
}
