package org.lxconan.mathExam;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Exam {
    private final QuestionSectionFactory[] factories;

    public Exam(QuestionSectionFactory... factories) {
        this.factories = factories;
    }

    @Override
    public String toString() {
        final QuestionSection[] questionSections = Arrays.stream(factories)
            .map(f -> f.create("Please calculate", 20))
            .toArray(QuestionSection[]::new);
        return Arrays.stream(questionSections)
            .map(QuestionSection::toString)
            .collect(Collectors.joining()) + "\n\nAnswers\n\n" +
            Arrays.stream(questionSections)
            .map(qs -> qs.toString(true))
            .collect(Collectors.joining());
    }
}
