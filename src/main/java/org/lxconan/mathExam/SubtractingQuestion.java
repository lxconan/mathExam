package org.lxconan.mathExam;

public class SubtractingQuestion extends BinaryQuestion {
    public SubtractingQuestion(int operandLeft, int operandRight, Estimation estimation) {
        super(operandLeft, operandRight, estimation, (a, b) -> a - b, "-");
    }
}
