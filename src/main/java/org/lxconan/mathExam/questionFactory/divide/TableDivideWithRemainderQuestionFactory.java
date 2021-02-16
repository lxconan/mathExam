package org.lxconan.mathExam.questionFactory.divide;

import org.lxconan.mathExam.Estimation;
import org.lxconan.mathExam.RandomNumberGenerator;
import org.lxconan.mathExam.question.DivideWithRemainderQuestion;
import org.lxconan.mathExam.question.Question;
import org.lxconan.mathExam.questionFactory.QuestionFactory;

public class TableDivideWithRemainderQuestionFactory implements QuestionFactory {
    private final Estimation estimation;

    public TableDivideWithRemainderQuestionFactory() {
        this(new Estimation(6, 12));
    }

    public TableDivideWithRemainderQuestionFactory(Estimation estimation) {
        this.estimation = estimation;
    }

    @Override
    public Question create() {
        final int rightOperand = RandomNumberGenerator.createNumber(2, 10);
        final int result = RandomNumberGenerator.createNumber(1, 10);
        final int leftOperand = rightOperand * result + RandomNumberGenerator.createNumber(1, rightOperand);
        return new DivideWithRemainderQuestion(leftOperand, rightOperand, estimation);
    }
}
