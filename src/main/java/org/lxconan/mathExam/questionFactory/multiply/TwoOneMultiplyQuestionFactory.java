package org.lxconan.mathExam.questionFactory.multiply;

import org.lxconan.mathExam.Estimation;

public class TwoOneMultiplyQuestionFactory extends XOneMultiplyQuestionFactory {
    public TwoOneMultiplyQuestionFactory() {
        this(new Estimation(12, 18));
    }

    public TwoOneMultiplyQuestionFactory(Estimation estimation) {
        super(2, estimation);
    }
}

