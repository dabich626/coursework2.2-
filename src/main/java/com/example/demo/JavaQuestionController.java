package com.example.demo;

public class JavaQuestionController {

    public JavaQuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    private final QuestionService questionService;

    @GetMaping()
    public void get(){
        questionService.getAll().add(null);
    }
}
