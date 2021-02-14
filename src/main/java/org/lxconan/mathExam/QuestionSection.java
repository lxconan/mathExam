package org.lxconan.mathExam;

import java.util.Arrays;

public class QuestionSection {
    private final String title;
    private final Question[] questions;

    public QuestionSection(String title, Question[] questions) {
        this.title = title;
        this.questions = questions;
    }

    public Estimation getEstimation() {
        return new Estimation(
            Arrays.stream(questions).mapToInt(q -> q.getEstimation().getMinimumSeconds()).sum(),
            Arrays.stream(questions).mapToInt(q -> q.getEstimation().getMaximumSeconds()).sum()
        );
    }

    public String getTitle() {
        return title;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public int size () { return questions.length; }

    @Override
    public String toString() {
        return toString(false);
    }

    public String toString(boolean includeAnswer) {
        final String estimationString = getEstimationString();
        var stringBuilder = new StringBuilder(getTitle())
            .append("    ").append(estimationString).append("\n");
        for (Question question : getQuestions()) {
            stringBuilder.append(question.toString(includeAnswer)).append("\n");
        }

        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    private String getEstimationString() {
        final var estimation = getEstimation();
        final var minimumMinutes = estimation.getMinimumMinutes();
        final var maximumMinutes = estimation.getMaximumMinutes();
        return "(" +
            minimumMinutes + " ~ " + maximumMinutes + " minutes" +
            ")";
    }
}
