package com.encuestas.controller;

import com.encuestas.dto.PollAnswerDTO;
import com.encuestas.model.PollAnswerModel;
import com.encuestas.model.PollModel;
import com.encuestas.service.PollServicesImp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("polls")
public class PollsController {
    private final PollServicesImp pollServicesImp;

    @Autowired
    public PollsController(PollServicesImp pollServicesImp) {
        this.pollServicesImp = pollServicesImp;
    }

    @GetMapping(produces = "application/json")
    public @ResponseBody
    Iterable<PollModel> getPoll() {
        return pollServicesImp.getQuestions();
    }

    @PostMapping(produces = "application/json")
    public @ResponseBody
    Iterable<PollAnswerModel> savePollAnswers(@RequestBody List<PollAnswerDTO> pollAnswerDTO) {
        return pollServicesImp.savePollAnswers(pollAnswerDTO);
    }
}
