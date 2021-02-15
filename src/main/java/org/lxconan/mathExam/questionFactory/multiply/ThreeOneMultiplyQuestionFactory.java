package org.lxconan.mathExam.questionFactory.multiply;

import org.lxconan.mathExam.Estimation;

public class ThreeOneMultiplyQuestionFactory extends XOneMultiplyQuestionFactory {
    public ThreeOneMultiplyQuestionFactory() {
        this(new Estimation(15, 38));
    }

    public ThreeOneMultiplyQuestionFactory(Estimation estimation) {
        super(3, estimation);
    }
}
