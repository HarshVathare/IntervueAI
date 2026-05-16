package com.code.Moch_Interview_Platform.IntervueAI.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "interview_sessions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InterviewSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String interviewRole;

    private String topic;

    private String difficulty;

    private double overAllScore;

    @CreationTimestamp
    private LocalDateTime startAt;

    private LocalDateTime endAt;

    @ManyToOne
    @JoinColumn(name = "user_Id")
    private User user;

    @OneToMany(mappedBy = "session", cascade = CascadeType.ALL)
    private List<Question> questions;
}
