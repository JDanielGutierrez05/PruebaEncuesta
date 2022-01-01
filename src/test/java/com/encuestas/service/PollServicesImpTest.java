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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.any;

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
    }

    @Test
    public void getQuestions() {
        Mockito.when(pollRepository.findAll()).thenReturn(pollModels);
        assertEquals(pollModels, pollServicesImp.getQuestions());
    }

    @Test
    public void savePollAnswersSucessful() {
        Assert.assertNotNull(pollServicesImp.savePollAnswers(List.of(PollAnswerDTO.builder().answer("test").questionId(1).build())));
    }
}