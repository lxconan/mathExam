package org.lxconan.mathExam.question;

import org.lxconan.mathExam.Estimation;

public class DivideWithRemainderQuestion extends BinarySymbolicQuestion {
    public DivideWithRemainderQuestion(int operandLeft, int operandRight, Estimation estimation) {
        super(operandLeft, operandRight, estimation, (a, b) -> (a / b) + " ... " + (a % b), "÷");
    }
}
