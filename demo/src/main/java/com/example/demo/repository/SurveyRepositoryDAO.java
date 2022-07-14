package com.example.demo.repository;

import com.example.demo.model.Survey;
import com.example.demo.model.SurveyKeyId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SurveyRepositoryDAO extends JpaRepository<Survey, SurveyKeyId> {

    List<Survey> findSurveysByIdSurveyIdAndIdQuestionId(String surveyId, String questionId);

}
