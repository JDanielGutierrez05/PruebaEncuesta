package com.encuestas.service;

import com.encuestas.dto.PollAnswerDTO;
import com.encuestas.model.PollModel;
import com.encuestas.repository.PollAnswersRepository;
import com.encuestas.repository.PollRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class PollServicesImpTest {

    @Mock
    PollAnswersRepository pollAnswersRepository;

    @Mock
    PollRepository pollRepository;

    @Mock
    List<PollModel> pollModels;

    PollServicesImp pollServicesImp;

    @Before
    public void setUp() {
        pollServicesImp = new PollServicesImp(pollRepository, pollAnswersRepository);
        Mockito.when(pollRepository.findAll()).thenReturn(pollModels);
    }

    @Test
    public void getQuestions() {
        Assert.assertEquals(pollModels, pollServicesImp.getQuestions());
    }

    @Test
    public void savePollAnswers() {
        Assert.assertNotNull(pollServicesImp.savePollAnswers(List.of(PollAnswerDTO.builder().answer("test").questionId(1).build())));
    }
}