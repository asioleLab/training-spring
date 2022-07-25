package com.example.demo;

public class SurveyBodyRequest {
    String surveyId;

    public SurveyBodyRequest(String surveyId) {
        this.surveyId = surveyId;
    }


    public String getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }


    public SurveyBodyRequest() {
    }
}
