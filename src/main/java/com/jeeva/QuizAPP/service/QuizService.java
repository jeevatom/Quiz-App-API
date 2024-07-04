package com.jeeva.QuizAPP.service;

import com.jeeva.QuizAPP.Entity.Quiz;
import com.jeeva.QuizAPP.dao.QuestionDao;
import com.jeeva.QuizAPP.dao.QuizDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.jeeva.QuizAPP.Entity.qs;
import java.util.List;

@Service
public class QuizService {

    @Autowired
     QuizDao quizDao;
    @Autowired
    QuestionDao questionDao;
    public ResponseEntity<String> createQuize(String category,int numQ,String title) {

        List<qs> questions=questionDao.findRandomQuestionsWithCategory(category,numQ);

        Quiz quiz=new Quiz();

        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizDao.save(quiz);
        return new ResponseEntity<>("Success",HttpStatus.CREATED);

    }
}
