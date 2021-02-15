package org.lxconan.mathExam.question;

import org.lxconan.mathExam.Estimation;

public interface Question {
    @Override
    String toString();
    String toString(boolean includeAnswer);

    Estimation getEstimation();

    @Override
    boolean equals(Object o);

    @Override
    int hashCode();
}
