package com.example.demo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ExamService implements ExaminerService {

private final QuestionService service;

    public ExamService(QuestionService service) {
        this.service = service;
    }

    public Collection<Question> getQuestions(int amount){

        var allQuestions = service.getAll();
        if(amount > allQuestions.size()){

            throw new NotTheRightAmountException();
        }

        Set<Question> result = new HashSet<>();
        while (result.size() != amount){

            result.add(service.getRandomQuestion());

        }

        return result;
    }
}
