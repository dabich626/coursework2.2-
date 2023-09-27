package com.example.demo;

import org.springframework.stereotype.Controller;


@Controller
@RequestMapping
public class ExamController {

    public ExamController(ExamService examService) {
        this.examService = examService;
    }

    private final ExamService examService;

    @GetMapping()

}
