package com.example.demo.controller;

import com.example.demo.dto.SurveyDTO;
import com.example.demo.model.Survey;
import com.example.demo.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/survey")
public class SurveyController {
    @Autowired
    private SurveyService surveyService;

    @RequestMapping(method = RequestMethod.GET,path = "/getSurvey")
    private String getSurvey(@RequestParam(required = false, defaultValue = "0") String idSurvey,
                             @RequestParam(required = false) String idQuestion){
       return surveyService.test(idSurvey,idQuestion);
    }

    @RequestMapping(method = RequestMethod.GET,path = "/getSurveyByIdSurvey")
    private SurveyDTO getSurveyByIdSurvey(@RequestParam(required = false, defaultValue = "0") String idSurvey){
        return surveyService.testIdSurvey(idSurvey);
    }

//    @RequestMapping(method = RequestMethod.GET,path = "/getSurveyCompleted")
//    private Map<String,String> getSurveyCompleted(@RequestParam(required = false, defaultValue = "0") String idSurvey){
//        return surveyService.(idSurvey);
//    }

}
