package com.encuestas.controller;

import com.encuestas.dto.PollAnswerDTO;
import com.encuestas.service.PollServicesImp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;


@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
class PollsControllerTest {

    @Mock
    PollServicesImp pollServicesImp;

    @Mock
    List<PollAnswerDTO> pollAnswerDTO;

    PollsController pollsController;

    @BeforeEach
    void setUp() {
        pollsController = new PollsController(pollServicesImp);
    }

    @Test
    void getPoll() {
        Assertions.assertEquals(pollsController.getPoll(), new ArrayList<>());
    }

    @Test
    void savePollAnswers() {
        Assertions.assertInstanceOf(ArrayList.class, pollsController.savePollAnswers(pollAnswerDTO));
    }
}