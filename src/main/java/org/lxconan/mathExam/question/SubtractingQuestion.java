package org.lxconan.mathExam.question;

import org.lxconan.mathExam.Estimation;

public class SubtractingQuestion extends BinaryQuestion {
    public SubtractingQuestion(int operandLeft, int operandRight, Estimation estimation) {
        super(operandLeft, operandRight, estimation, (a, b) -> a - b, "-");
    }
}
