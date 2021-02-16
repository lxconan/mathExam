package org.lxconan.mathExam.question;

import org.lxconan.mathExam.Estimation;

import java.util.Objects;
import java.util.function.BiFunction;

public class BinarySymbolicQuestion implements Question {
    private final int operandLeft;
    private final int operandRight;
    private final Estimation estimation;
    private final BiFunction<Integer, Integer, String> calculation;
    private final String operatorSymbol;

    public BinarySymbolicQuestion(
        int operandLeft,
        int operandRight,
        Estimation estimation,
        BiFunction<Integer, Integer, String> calculation,
        String operatorSymbol) {
        this.operandLeft = operandLeft;
        this.operandRight = operandRight;
        this.estimation = estimation;
        this.calculation = calculation;
        this.operatorSymbol = operatorSymbol;
    }

    @Override
    public Estimation getEstimation() {
        return estimation;
    }

    @Override
    public String toString() {
        return toString(false);
    }

    @Override
    public String toString(boolean includeAnswer) {
        return String.format("%d %s %d = ", operandLeft, operatorSymbol, operandRight) +
            (includeAnswer ? calculation.apply(operandLeft, operandRight) : "");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        var that = (BinarySymbolicQuestion) o;
        return operandLeft == that.operandLeft &&
            operandRight == that.operandRight &&
            operatorSymbol.equals(that.operatorSymbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operandLeft, operandRight, operatorSymbol);
    }
}
