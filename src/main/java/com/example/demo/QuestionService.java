package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public interface QuestionService  {



    List<Questions> = new ArrayList<>();
    List<Answers>  = new ArrayList<>();




    public static void add(String question, String answer){


        Questions.add(Questions.size(), question);
        Answers.add(Answers.size(), answer);
    }

    public static void addQue(Question question){


        Questions.add(Questions.size(), question.question);
    }

    public  static void remove(Question question){

        Questions.remove(question);
    }

    public static void getAllQue(Question question){

        for (int i = 0; i < Questions.size(); i++) {

            Questions.getAll();
        }
        }

        public static void getRandomQue(Question question){

        Questions.random();
        }


}
