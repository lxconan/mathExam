package org.lxconan.mathExam.questionFactory.add;

import org.lxconan.mathExam.Estimation;
import org.lxconan.mathExam.RandomNumberGenerator;
import org.lxconan.mathExam.question.AddingQuestion;
import org.lxconan.mathExam.question.Question;
import org.lxconan.mathExam.questionFactory.QuestionFactory;

public class AddingQuestionResultRestrictedFactory implements QuestionFactory {
    private final int maximumResult;
    private final Estimation estimation;

    public AddingQuestionResultRestrictedFactory(int maximumResult, Estimation estimation) {
        this.maximumResult = maximumResult;
        this.estimation = estimation;
    }

    public Question create() {
        int o1, o2;

        double factor = (maximumResult / 10.0) / ((maximumResult / 10.0) + 1.0);
        o1 = RandomNumberGenerator.createNumber(0, (int)(maximumResult * factor));
        o2 = RandomNumberGenerator.createNumber(0, maximumResult - o1);

        return new AddingQuestion(
            o1,
            o2,
            estimation
        );
    }
}
