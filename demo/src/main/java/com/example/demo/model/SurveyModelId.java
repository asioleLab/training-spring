package com.example.demo.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ms_survey_complete")
public class SurveyModelId {

    @EmbeddedId
    private SurveyModel id;

    public SurveyModelId() {
    }

    public SurveyModelId(SurveyModel id) {
        this.id = id;
    }

    public SurveyModel getId() {
        return id;
    }

    public void setId(SurveyModel id) {
        this.id = id;
    }
}
