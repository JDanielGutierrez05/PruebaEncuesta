package com.encuestas.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Entity
@Table(name = "poll_questions")
public class PollModel {
    @Id
    @Column(name="question_id")
    private int questionId;

    private String question;

    private boolean multipleAnswers;

    @ElementCollection
    private List<String> answers;
}