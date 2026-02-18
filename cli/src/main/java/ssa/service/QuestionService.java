package ssa.service;

import ssa.model.Question;
import ssa.repo.QuestionRepository;

import java.util.List;

public class QuestionService {
    private QuestionRepository repo;

    public QuestionService(QuestionRepository repo) {
        this.repo = repo;
    }

    public List<Question> getQuestions() {
        return repo.loadQuestions();
    }
}
