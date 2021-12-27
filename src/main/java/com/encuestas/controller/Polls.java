package com.encuestas.controller;

import com.encuestas.services.PollServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("polls")
public class Polls {
    private final PollServices pollServices;

    @Autowired
    public Polls (PollServices pollServices) {
        this.pollServices = pollServices;
    }

    @GetMapping(produces = "application/json")
    public @ResponseBody String getPolls() {
        return pollServices.poll();
    }
}
