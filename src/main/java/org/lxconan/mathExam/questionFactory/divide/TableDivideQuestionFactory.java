package org.lxconan.mathExam.questionFactory.divide;

import org.lxconan.mathExam.Estimation;
import org.lxconan.mathExam.RandomNumberGenerator;
import org.lxconan.mathExam.question.DivideQuestion;
import org.lxconan.mathExam.question.Question;
import org.lxconan.mathExam.questionFactory.QuestionFactory;

public class TableDivideQuestionFactory implements QuestionFactory {
    private final Estimation estimation;

    public TableDivideQuestionFactory() {
        this(new Estimation(1, 3));
    }

    public TableDivideQuestionFactory(Estimation estimation) {
        this.estimation = estimation;
    }

    @Override
    public Question create() {
        final int rightOperand = RandomNumberGenerator.createNumber(1, 10);
        final int result = RandomNumberGenerator.createNumber(1, 10);
        final int leftOperand = rightOperand * result;
        return new DivideQuestion(leftOperand, rightOperand, estimation);
    }
}
