package com.encuestas.controller;

import com.encuestas.model.PollModel;
import com.encuestas.service.PollServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("polls")
public class PollsController {
    private final PollServices pollServices;

    @Autowired
    public PollsController(PollServices pollServices) {
        this.pollServices = pollServices;
    }

    @GetMapping(produces = "application/json")
    public @ResponseBody Iterable<PollModel> getPoll() {
        return pollServices.getQuestions();
    }
}
