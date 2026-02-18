package ssa.controller;

import ssa.service.QuestionService;

import java.util.Scanner;

public class QuestionController {
    private QuestionService service;
    private Scanner scan;

    public QuestionController(QuestionService service, Scanner scan) {
        this.service = service;
        this.scan = scan;
    }

    public void run() {
        var questions = service.getQuestions();
        int correctAnswer = 0;
        for (var question : questions) {
            System.out.println(question.question());
            var answers = question.answers();
            for (int i = 0; i < answers.size(); i++) {
                System.out.println((i + 1) + ") " + answers.get(i));
            }
            int response = scan.nextInt() - 1;
            if (response == question.correctAnswer()) correctAnswer++;
        }
        System.out.println("You got " + correctAnswer + " out of " + questions.size());
    }
}
