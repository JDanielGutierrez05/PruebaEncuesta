package com.encuestas.model;

import lombok.*;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Entity
@Table(name = "poll_questions")
public class PollModel {
    @Id
    private int questionId;
    private String question;
    private boolean multipleAnswers;
    @ElementCollection
    private List<String> answers;
}