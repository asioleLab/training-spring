package com.example.demo.model;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ms_survey")
public class Survey {

    @EmbeddedId
    private SurveyKeyId surveyKeyId;

    public Survey(){

    }
    public Survey(SurveyKeyId surveyKeyId){
        this.surveyKeyId = surveyKeyId;
    }

    public SurveyKeyId getSurveyKeyId() {
        return surveyKeyId;
    }

    public void setSurveyKeyId(SurveyKeyId surveyKeyId) {
        this.surveyKeyId = surveyKeyId;
    }


}
