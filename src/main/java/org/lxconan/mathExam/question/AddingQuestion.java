package org.lxconan.mathExam.question;

import org.lxconan.mathExam.Estimation;

public class AddingQuestion extends BinaryQuestion {
    public AddingQuestion(int operandLeft, int operandRight, Estimation estimation) {
        super(operandLeft, operandRight, estimation, Integer::sum, "+");
    }
}

