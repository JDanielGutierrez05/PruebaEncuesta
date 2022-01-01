package com.encuestas.controller;

import com.encuestas.dto.PollAnswerDTO;
import com.encuestas.service.PollServicesImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class PollsControllerTest {

    @Mock
    PollServicesImp pollServicesImp;

    @Mock
    List<PollAnswerDTO> pollAnswerDTO;

    PollsController pollsController;

    @Before
    public void setUp() {
        pollsController = new PollsController(pollServicesImp);
    }

    @Test
    public void getPoll() {
        Assert.assertEquals(pollsController.getPoll(), new ArrayList<>());;
    }

    @Test
    public void savePollAnswers() {
        Assert.assertNotNull(pollsController.savePollAnswers(pollAnswerDTO));
    }
}