package org.lxconan.mathExam;

public class MultiplyQuestion extends BinaryQuestion {
    public MultiplyQuestion(int operandLeft, int operandRight, Estimation estimation) {
        super(operandLeft, operandRight, estimation, (a, b) -> a * b, "x");
    }
}
