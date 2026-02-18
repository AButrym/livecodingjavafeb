package ssa.model;

import java.util.List;

public record Question(
     String question,
     List<String> answers,
     int correctAnswer
) {
}
