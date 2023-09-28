package com.example.demo;

import org.springframework.stereotype.Controller;


@Controller
@RequestMapping
public class ExamController {

    public ExamController(ExamService examService) {
        this.examService = examService;
    }

    private final ExamService examService;

    @GetMapping(path = “/exam/java/add?question=QuestionText&answer=QuestionAnswer”)
    public String addQuestion(){

        return QuestionService.add(addQuestion());
    }

    @GetMapping(path = “/exam/java/remove?question=QuestionText&answer=QuestionAnswer”)
    public String removeQuestion(){

        return QuestionService.Questions.remove(index);
    }

    @GetMapping(path =  “/exam/java”)
    public String getAllQuestions(){

        return QuestionService.getAllQue(Question);
    }


}
