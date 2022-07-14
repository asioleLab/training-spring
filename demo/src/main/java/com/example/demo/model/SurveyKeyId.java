package com.example.demo.model;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class SurveyKeyId implements Serializable {

    @NotNull
    @Column(name = "survey_id")
    private String surveyId;

    @NotNull
    @Column(name = "question_id")
    private String questionId;



    public SurveyKeyId() {
    }

    public String getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }


}
