package org.lxconan.mathExam;

public class AddingQuestion extends BinaryQuestion {
    public AddingQuestion(int operandLeft, int operandRight, Estimation estimation) {
        super(operandLeft, operandRight, estimation, Integer::sum, "+");
    }
}
