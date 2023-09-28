package com.example.demo;

import java.util.Collection;

public interface ExaminerService {



public static void getAllQuestionsList(int amount){

    Question question = new Question();

    Collection<Question> getQuestions(amount);

    if (amount > getQuestions.size()){

        throw new NotTheRightAmountException();
    }
}
}
