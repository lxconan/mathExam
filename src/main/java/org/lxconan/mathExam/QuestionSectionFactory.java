package org.lxconan.mathExam;

import org.lxconan.mathExam.question.Question;
import org.lxconan.mathExam.questionFactory.QuestionFactory;

import java.util.HashSet;
import java.util.Set;

public class QuestionSectionFactory {
    private final int numbers;
    private final QuestionFactory[] questionFactories;

    public QuestionSectionFactory(int numbers, QuestionFactory... questionFactories) {
        this.questionFactories = questionFactories;
        this.numbers = numbers;
    }

    public QuestionSectionFactory(QuestionFactory... questionFactories) {
        this(20, questionFactories);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    public QuestionSection create(String title) {
        Set<Question> questions = new HashSet<>();

        for (int i = 0; i < numbers; ++i) {
            while (!createQuestion(questions)) { /* do nothing */ }
        }

        return new QuestionSection(title, questions.toArray(new Question[0]));
    }

    private boolean createQuestion(Set<Question> questions) {
        final var factoryIndex = RandomNumberGenerator.createNumber(0, questionFactories.length);
        final var selectedFactory = questionFactories[factoryIndex];
        final var question = selectedFactory.create();
        return questions.add(question);
    }
}
