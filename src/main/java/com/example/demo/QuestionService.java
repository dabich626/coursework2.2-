package com.example.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public interface QuestionService  {



    Question add (String question, String answer);

    Question add (Question question);

    Question remove (Question question);

    Collection<Question> getAll();

    Question getRandomQuestion();


}
