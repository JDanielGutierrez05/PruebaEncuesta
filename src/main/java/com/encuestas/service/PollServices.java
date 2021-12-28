package com.encuestas.service;

import com.encuestas.model.PollModel;
import com.encuestas.repository.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PollServices {
    private final PollRepository pollRepository;

    @Autowired
    public PollServices(PollRepository pollRepository){
        this.pollRepository = pollRepository;
    }

    public Iterable<PollModel> getQuestions(){
        return pollRepository.findAll();
    }
}
