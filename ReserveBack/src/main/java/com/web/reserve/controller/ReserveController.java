package com.web.reserve.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.reserve.service.testService;

@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
public class ReserveController {

    private final testService testService;

    @GetMapping(value = "testConnect")
    public int testConnect(){
        int num = 0;

        num = testService.testConnect();

        return num;
    }
}
