package com.example.demo.service;

//import org.springframework.stereotype.Service;

import com.example.demo.dto.SurveyPutDTO;
import com.example.demo.dto.SurveyDTO;
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

//    @Autowired
//    SurveyRepositoryCompleteRepository surveyRepositoryCompleteDAO;

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
    public SurveyDTO testIdSurvey(String surveyId){
        SurveyDTO surveyDTO =new SurveyDTO();
        List<Survey> result=surveyRepository.findSurveysByIdSurveyId(surveyId);
        if(!CollectionUtils.isEmpty(result)){
            Map<String,String> questionarioMap = new HashMap<>();

            for (Survey survey : result) {
                if(survey.getId()!=null){
                    List<String> risposte=new ArrayList<>();


                        risposte.add(survey.getAnswerId());


                    SurveyDTO.SurveyRow surveyRow =new SurveyDTO.SurveyRow(survey.getId().getQuestionId(),risposte);
//                    questionarioMap.put(survey.getId().getQuestionId(),survey.getAnswerId());
                        surveyDTO.getBody().add(surveyRow);
                }

            }
//
//            survey.setBody(questionarioMap);
            return surveyDTO;
        }else{
            return null;
//            return Collections.emptyMap();
        }
    }


    public SurveyPutDTO addRow(SurveyPutDTO surveyPutDTO){

        Survey survey=new Survey();
        SurveyKeyId surveyKeyId=new SurveyKeyId();
        surveyKeyId.setSurveyId(surveyPutDTO.getIdSurvey());
        surveyKeyId.setQuestionId(surveyPutDTO.getDomanda());
        survey.setId(surveyKeyId);
        survey.setAnswerId(surveyPutDTO.getRisposta());

        surveyRepository.save(survey);
        System.out.println(surveyRepository);
//        surveyRepository.map(save(surveyId,question,answer);
        return surveyPutDTO;
    }
}
