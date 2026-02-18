package ssa.repo;

import ssa.model.Question;

import java.util.List;

public class QuestionRepository {
    public List<Question> loadQuestions() {
        return List.of(
                new Question(
                        "What is JVM?",
                        List.of("Java Very Mad", "Java Virtual Machine", "Just Virtual Memory"),
                        1
                ),
                new Question(
                        "Which keyword creates an immutable class?",
                        List.of("final", "static", "const"),
                        0
                )
        );
    }
}
