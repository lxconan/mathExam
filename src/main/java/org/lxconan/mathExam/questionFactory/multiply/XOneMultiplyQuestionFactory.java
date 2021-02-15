package org.lxconan.mathExam.questionFactory.multiply;

import org.lxconan.mathExam.Estimation;
import org.lxconan.mathExam.RandomNumberGenerator;
import org.lxconan.mathExam.question.MultiplyQuestion;
import org.lxconan.mathExam.question.Question;
import org.lxconan.mathExam.questionFactory.QuestionFactory;

public class XOneMultiplyQuestionFactory implements QuestionFactory {
    private final int decimalNumber;
    private final Estimation estimation;

    public XOneMultiplyQuestionFactory(int decimalNumber, Estimation estimation) {
        this.decimalNumber = decimalNumber;
        this.estimation = estimation;
    }

    @Override
    public Question create() {
        int minimum = (int) Math.pow(10, decimalNumber - 1);
        int maximum = (int) Math.pow(10, decimalNumber);

        final int left = RandomNumberGenerator.createNumber(minimum, maximum);
        final int right = RandomNumberGenerator.createNumber(1, 10);

        return new MultiplyQuestion(left, right, estimation);
    }
}
