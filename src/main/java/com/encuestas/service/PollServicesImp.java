package com.encuestas.service;

import com.encuestas.dto.PollAnswerDTO;
import com.encuestas.model.PollAnswerModel;
import com.encuestas.model.PollModel;
import com.encuestas.repository.PollAnswersRepository;
import com.encuestas.repository.PollRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class PollServicesImp {
    private final PollRepository pollRepository;
    private final PollAnswersRepository pollAnswersRepository;

    @Autowired
    public PollServicesImp(PollRepository pollRepository,
                           PollAnswersRepository pollAnswersRepository) {
        this.pollRepository = pollRepository;
        this.pollAnswersRepository = pollAnswersRepository;
    }

    public Iterable<PollModel> getQuestions() {
        return pollRepository.findAll();
    }

    public Iterable<PollAnswerModel> savePollAnswers(List<PollAnswerDTO> pollAnswerDTO) {
        List<PollAnswerModel> pollAnswerList = new ArrayList<>();
        pollAnswerDTO.forEach(answer -> pollAnswerList.add(PollAnswerModel.builder().questionId(answer.getQuestionId()).answer(answer.getAnswer()).build()));
        try {
            return pollAnswersRepository.saveAll(pollAnswerList);
        } catch (Exception ex) {
            log.error(ex.getMessage());
            throw ex;
        }
    }
}
