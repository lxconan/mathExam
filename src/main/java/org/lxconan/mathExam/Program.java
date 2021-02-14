package org.lxconan.mathExam;

public class Program {
    public static void main(String[] args) {
        final Exam exam = new Exam(
            new QuestionSectionFactory(new AddingQuestionResultRestrictedFactory(50, new Estimation(3, 6))),
            new QuestionSectionFactory(new AddingQuestionResultRestrictedFactory(100, new Estimation(4, 8))),
            new QuestionSectionFactory(new SubtractingQuestionResultRestrictedFactory(100, new Estimation(4, 8))),
            new QuestionSectionFactory(new TwoOneMultiplyQuestionFactory(new Estimation(9, 16)))
        );

        System.out.println(exam.toString());
    }
}
