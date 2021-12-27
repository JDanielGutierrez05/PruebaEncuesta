package com.encuestas.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("polls")
public class Polls {

    @GetMapping(produces = "application/json")
    public @ResponseBody String getBook() {
        log.info("Hi Log");
        return "Hi";
    }

}
