package com.encuestas.repository;

import com.encuestas.model.PollModel;
import org.springframework.data.repository.CrudRepository;

public interface PollRepository extends CrudRepository<PollModel, Long> {
}
