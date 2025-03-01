package com.jeeva.QuizAPP.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jeeva.QuizAPP.service.QuizService;

@RestController
@RequestMapping("quiz")
public class QuizController {
   
    @Autowired
    QuizService quizservice;
    
    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam String category,@RequestParam int numQ,@RequestParam String title){
         return quizservice.createQuize(category,numQ,title);
    }
}
