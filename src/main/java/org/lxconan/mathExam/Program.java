package org.lxconan.mathExam;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        final var questionSectionFactory = new QuestionSectionFactory(
            new AddingQuestionResultRestrictedFactory(100, new Estimation(6, 9)),
            new SubtractingQuestionResultRestrictedFactory(100, new Estimation(6, 9)));

        final var questionSection = questionSectionFactory.create("1", 30);

        Arrays.stream(questionSection.getQuestions())
            .forEach(q -> System.out.println(q.toString()));
    }
}
