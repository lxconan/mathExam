package org.lxconan.mathExam.questionFactory.multiply;

import org.lxconan.mathExam.Estimation;
import org.lxconan.mathExam.RandomNumberGenerator;
import org.lxconan.mathExam.question.MultiplyQuestion;
import org.lxconan.mathExam.question.Question;
import org.lxconan.mathExam.questionFactory.QuestionFactory;

public class TableMultiplyWithZerosFactory implements QuestionFactory {
    private final Estimation estimation;
    private static final int[] factors = { 1, 10, 100 };

    public TableMultiplyWithZerosFactory() {
        this(new Estimation(6, 9));
    }

    public TableMultiplyWithZerosFactory(Estimation estimation) {
        this.estimation = estimation;
    }

    @Override
    public Question create() {
        final int left = RandomNumberGenerator.createNumber(1, 10) * getFactors();
        final int right = RandomNumberGenerator.createNumber(1, 10) * getFactors();
        return new MultiplyQuestion(left, right, estimation);
    }

    private static int getFactors () {
        final int index = RandomNumberGenerator.createNumber(0, 3);
        return factors[index];
    }
}