package com.example.demo;

import java.util.*;

public class JavaQuestionService implements QuestionService {

    private final Set<Question> questions = new HashSet<>();

    private final Random random = new Random();

    @Override
    public Question add(String question, String answer) {

        return add(new Question(question, answer));


    }

    @Override
    public Question add(Question question) {
        questions.add(question);

        return question;
    }

    @Override
    public Question remove(Question question) {

        if (questions.remove(question)){
        return question;}

        return null;
    }

    @Override
    public Collection<Question> getAll() {

        return new HashSet<>(questions);
    }

    @Override
    public Question getRandomQuestion() {

      var index =  random.nextInt(questions.size());

      int i = 0;
      var it = questions.iterator();
      while (it.hasNext()){

          var question = it.next();

          if (i == index) {

          return it.next();}

          index ++;
      }
throw new NotTheRightAmountException();

    }
}
