package com.example.demo.service;

//import org.springframework.stereotype.Service;

import com.example.demo.model.Survey;
import com.example.demo.model.SurveyKeyId;
import com.example.demo.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;

@Service
public class SurveyService {
    @Autowired
    SurveyRepository surveyRepository;

    public String test(String surveyId, String questionId){
        SurveyKeyId surveyKeyId=new SurveyKeyId();
        surveyKeyId.setSurveyId(surveyId);
        surveyKeyId.setQuestionId(questionId);
        Optional<Survey> result=surveyRepository.findById(surveyKeyId);
        if(result.isPresent()){
            System.out.println("qui "+result.get());
            return result.get().getAnswerId();
        }else{
            return "errore";
        }
    }
    public Map<String,String> testIdSurvey(String surveyId){

        List<Survey> result=surveyRepository.findSurveysByIdSurveyId(surveyId);
        if(!CollectionUtils.isEmpty(result)){
            Map<String,String> questionarioMap = new HashMap<>();
            for (Survey survey : result) {
                System.out.println("qui "+survey.getAnswerId());
                if(survey.getId()!=null){
                    questionarioMap.put(survey.getId().getQuestionId(),survey.getAnswerId());
                }

            }
            return questionarioMap;
        }else{
            return Collections.singletonMap("status", "errore");
//            return Collections.emptyMap();
        }
    }
}
