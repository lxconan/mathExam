package org.lxconan.mathExam;

import org.lxconan.mathExam.questionFactory.multiply.TableMultiplyFactory;
import org.lxconan.mathExam.questionFactory.multiply.TableMultiplyWithZerosFactory;
import org.lxconan.mathExam.questionFactory.multiply.ThreeOneMultiplyQuestionFactory;
import org.lxconan.mathExam.questionFactory.multiply.TwoOneMultiplyQuestionFactory;

public class Program {
    public static void main(String[] args) {
        final Exam exam = createMultiplyExam();

        System.out.println(exam.toString());
    }

    private static Exam createMultiplyExam() {
        return new Exam(
            new QuestionSectionFactory(25, new TableMultiplyFactory()),
            new QuestionSectionFactory(20, new TableMultiplyWithZerosFactory()),
            new QuestionSectionFactory(20, new TwoOneMultiplyQuestionFactory()),
            new QuestionSectionFactory(8, new ThreeOneMultiplyQuestionFactory())
        );
    }
}
