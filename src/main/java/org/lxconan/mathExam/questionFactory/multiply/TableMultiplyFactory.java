package org.lxconan.mathExam.questionFactory.multiply;

import org.lxconan.mathExam.Estimation;

public class TableMultiplyFactory extends XOneMultiplyQuestionFactory {
    public TableMultiplyFactory() {
        this(new Estimation(1, 3));
    }

    public TableMultiplyFactory(Estimation estimation) {
        super(1, estimation);
    }
}
