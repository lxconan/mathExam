package org.lxconan.mathExam.question;

import org.lxconan.mathExam.Estimation;

public class DivideQuestion extends BinaryQuestion {
    public DivideQuestion(int operandLeft, int operandRight, Estimation estimation) {
        super(operandLeft, operandRight, estimation, (a, b) -> a / b, "÷");
    }
}
