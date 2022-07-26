package com.example.demo.dto;

import java.util.ArrayList;
import java.util.List;

public class SurveyCompleteDTO {
    public static class SurveyRow{
       String domanda;
       String risposta;

        public SurveyRow(String domanda, String risposta) {
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

        public void setRisposta(String risposte) {
            this.risposta = risposte;
        }
    }
    public List<SurveyDTO.SurveyRow> getBody() {
        return body;
    }

    public void setBody( List<SurveyDTO.SurveyRow> body) {
        this.body = body;
    }

    private  List<SurveyDTO.SurveyRow> body=new ArrayList<>();

}
