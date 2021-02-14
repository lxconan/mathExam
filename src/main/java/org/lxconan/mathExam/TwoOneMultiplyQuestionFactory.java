package org.lxconan.mathExam;

public class TwoOneMultiplyQuestionFactory implements QuestionFactory {
    private final Estimation estimation;

    public TwoOneMultiplyQuestionFactory(Estimation estimation) {
        this.estimation = estimation;
    }

    @Override
    public Question create() {
        final int left = RandomNumberGenerator.createNumber(10, 100);
        final int right = RandomNumberGenerator.createNumber(1, 10);
        return new MultiplyQuestion(left, right, estimation);
    }
}
