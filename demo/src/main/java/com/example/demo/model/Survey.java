package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ms_survey")
public class Survey {

    public SurveyKeyId getId() {
        return id;
    }

    public void setId(SurveyKeyId id) {
        this.id = id;
    }

    @EmbeddedId
    private SurveyKeyId id;

    @Column(name = "answer_id")
    private String answerId;


    public Survey(){

    }
    public Survey(SurveyKeyId surveyKeyId){
        this.id = surveyKeyId;
    }

//    public SurveyKeyId getSurveyKeyId() {
//        return surveyKeyId;
//    }
//
//    public void setSurveyKeyId(SurveyKeyId surveyKeyId) {
//        this.surveyKeyId = surveyKeyId;
//    }

    public String getAnswerId() {
        return answerId;
    }

    public void setAnswerId(String answerId) {
        this.answerId = answerId;
    }

}
