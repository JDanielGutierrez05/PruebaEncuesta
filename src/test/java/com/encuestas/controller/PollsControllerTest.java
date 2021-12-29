package com.encuestas.controller;

import com.encuestas.model.PollModel;
import com.encuestas.service.PollServices;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;


@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
class PollsControllerTest {

    @Mock
    PollServices pollServices;

    List<PollModel> poll;

    @BeforeEach
    void setUp() {
        poll = List.of(PollModel.builder().question("test").questionId(1).build());
        Mockito.when(pollServices.getQuestions()).thenReturn(poll);
    }

    @Test
    void getPoll() {
        Assertions.assertEquals(pollServices.getQuestions(), poll);
    }
}