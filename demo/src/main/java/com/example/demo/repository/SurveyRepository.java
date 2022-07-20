package com.example.demo.repository;

import com.example.demo.model.Survey;
import com.example.demo.model.SurveyKeyId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface SurveyRepository extends JpaRepository<Survey, SurveyKeyId> {
    List<Survey> findSurveysByIdSurveyId(String surveyId);
}
