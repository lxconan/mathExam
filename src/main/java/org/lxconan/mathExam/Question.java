package org.lxconan.mathExam;

public interface Question {
    @Override
    String toString();

    Estimation getEstimation();

    @Override
    boolean equals(Object o);

    @Override
    int hashCode();
}
