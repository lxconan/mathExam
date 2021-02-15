package org.lxconan.mathExam.questionFactory.add;

import org.lxconan.mathExam.Estimation;

public class AddQuestionResultWithin20Factory extends AddingQuestionResultRestrictedFactory {
    public AddQuestionResultWithin20Factory() {
        super(20, new Estimation(3, 6));
    }
}
