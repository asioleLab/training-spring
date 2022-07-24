package com.example.demo.model;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class SurveyModel implements Serializable {

    @NotNull
    @Column(name = "survey_id")
    private String surveyId;

    @NotNull
    @Column(name = "question_id")
    private String questionId;

    @NotNull
    @Column(name="answer_id")
    private String answerId;


    public SurveyModel() {
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

    public String getAnswerId() {
        return answerId;
    }

    public void setAnswerId(String answerId) {
        this.answerId = answerId;
    }

    public SurveyModel(String surveyId, String questionId, String answerId) {
        this.surveyId = surveyId;
        this.questionId = questionId;
        this.answerId = answerId;
    }
}
