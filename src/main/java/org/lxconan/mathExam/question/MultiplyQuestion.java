package org.lxconan.mathExam.question;

import org.lxconan.mathExam.Estimation;

public class MultiplyQuestion extends BinaryQuestion {
    public MultiplyQuestion(int operandLeft, int operandRight, Estimation estimation) {
        super(operandLeft, operandRight, estimation, (a, b) -> a * b, "x");
    }
}
