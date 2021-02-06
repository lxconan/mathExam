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
}
