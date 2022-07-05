package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/survey")
public class SurveyController {
    @RequestMapping(method = RequestMethod.GET,path = "/getSurvey")
    private String getSurvey(@RequestParam(required = false, defaultValue = "0") String idSurvey){
        return idSurvey;
    }

}
