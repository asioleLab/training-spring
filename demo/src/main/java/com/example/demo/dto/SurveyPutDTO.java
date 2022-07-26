package com.example.demo.dto;

public class SurveyPutDTO {
    String domanda;
    String risposta;

    public SurveyPutDTO(String domanda, String risposta, String idSurvey) {
        this.domanda = domanda;
        this.risposta = risposta;
        this.idSurvey = idSurvey;
    }

    public SurveyPutDTO() {
    }

    String idSurvey;

    public SurveyPutDTO(String domanda, String risposta) {
        this.domanda = domanda;
        this.risposta = risposta;
    }

    public String getDomanda() {
        return domanda;
    }

    public void setDomanda(String domanda) {
        this.domanda = domanda;
    }

    public String getRisposta() {
        return risposta;
    }

    public void setRisposta(String risposta) {
        this.risposta = risposta;
    }

    public String getIdSurvey() {
        return idSurvey;
    }

    public void setIdSurvey(String idSurvey) {
        this.idSurvey = idSurvey;
    }
}
