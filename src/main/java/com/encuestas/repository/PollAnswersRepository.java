package com.encuestas.repository;

import com.encuestas.model.PollAnswerModel;
import org.springframework.data.repository.CrudRepository;

public interface PollAnswersRepository extends CrudRepository<PollAnswerModel, Long> {
}
