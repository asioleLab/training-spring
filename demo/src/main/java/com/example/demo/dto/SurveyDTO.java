package com.example.demo.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SurveyDTO {
    public static class SurveyRow{
        String domanda;
        List<String> risposte;

        public SurveyRow(String domanda, List<String> risposte) {
            this.domanda = domanda;
            this.risposte = risposte;
        }

        public String getDomanda() {
            return domanda;
        }

        public void setDomanda(String domanda) {
            this.domanda = domanda;
        }

        public List<String> getRisposte() {
            return risposte;
        }

        public void setRisposte(List<String> risposte) {
            this.risposte = risposte;
        }
    }
    public List<SurveyRow> getBody() {
        return body;
    }

    public void setBody( List<SurveyRow> body) {
        this.body = body;
    }

    private  List<SurveyRow> body=new ArrayList<>();

}
