package com.example.demo;

import org.springframework.stereotype.Controller;


@Controller
@RequestMapping
public class ExamController {

    public ExamController(ExamService examService) {
        this.examService = examService;
    }

    private final ExamService  examService;

    @GetMapping(path = “/exam/java/add”)
    public String addQuestion(@RequestParam String question, @RequestParam String answer){
        return QuestionService.add(addQuestion(question, answer));
    }
    @GetMapping(path = “/exam/java/remove”)

    public String removeQuestion(@RequestParam String question, @RequestParam String answer){

        return QuestionService.Questions.remove(removeQuestion(question, answer));
    }

    @GetMapping(path =  “/exam/java”)
    public String getAllQuestions(){

        return QuestionService.getAllQue(getAllQuestions());
    }


}
