package org.lxconan.mathExam;

public class AddQuestionResultWithin20Factory extends AddingQuestionResultRestrictedFactory {
    public AddQuestionResultWithin20Factory() {
        super(20, new Estimation(3, 6));
    }
}
