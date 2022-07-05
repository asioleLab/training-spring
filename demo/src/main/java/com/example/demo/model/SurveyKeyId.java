package com.example.demo.model;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class SurveyKeyId implements Serializable {
    private String surveyId;
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
