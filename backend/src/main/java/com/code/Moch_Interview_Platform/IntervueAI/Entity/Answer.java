package com.code.Moch_Interview_Platform.IntervueAI.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "answers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String userAnswer;

    @Column(columnDefinition = "TEXT")
    private String aiFeedback;

    private double score;

    private double communicationScore;

    private double technicalScore;

    @OneToOne
    @JoinColumn(name = "question_Id")
    private Question question;

}
