package org.lxconan.mathExam.questionFactory.subtract;

import org.lxconan.mathExam.Estimation;
import org.lxconan.mathExam.RandomNumberGenerator;
import org.lxconan.mathExam.question.Question;
import org.lxconan.mathExam.question.SubtractingQuestion;
import org.lxconan.mathExam.questionFactory.QuestionFactory;

public class SubtractingQuestionResultRestrictedFactory implements QuestionFactory {
    private final int maximumOperand;
    private final Estimation estimation;

    public SubtractingQuestionResultRestrictedFactory(int maximumOperand, Estimation estimation) {
        this.maximumOperand = maximumOperand;
        this.estimation = estimation;
    }

    @Override
    public Question create() {
        int o1, o2;

        o1 = RandomNumberGenerator.createNumber(maximumOperand / 3, maximumOperand);
        o2 = RandomNumberGenerator.createNumber(0, o1);

        return new SubtractingQuestion(o1, o2, estimation);
    }
}
