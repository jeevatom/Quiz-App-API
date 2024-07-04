package com.jeeva.QuizAPP.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jeeva.QuizAPP.Entity.qs;



@Repository
public interface QuestionDao extends JpaRepository<qs,Integer>  {
   List<qs> findByProgramminglanguage(String programminglanguage);

    @Query(value = "Select * from questions q where q.programminglanguage=:category ORDER BY RANDOM() LIMIT : numQ",nativeQuery = true)
   List<qs> findRandomQuestionsWithCategory(String category, int numQ);
}
