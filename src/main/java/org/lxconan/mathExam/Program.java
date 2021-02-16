package org.lxconan.mathExam;

import org.lxconan.mathExam.questionFactory.divide.TableDivideQuestionFactory;
import org.lxconan.mathExam.questionFactory.divide.TableDivideWithRemainderQuestionFactory;
import org.lxconan.mathExam.questionFactory.multiply.TableMultiplyFactory;
import org.lxconan.mathExam.questionFactory.multiply.TableMultiplyWithZerosFactory;
import org.lxconan.mathExam.questionFactory.multiply.ThreeOneMultiplyQuestionFactory;
import org.lxconan.mathExam.questionFactory.multiply.TwoOneMultiplyQuestionFactory;

public class Program {
    public static void main(String[] args) {
        final Exam exam = createExam();

        System.out.println(exam.toString());
    }

    private static Exam createExam() {
        return new Exam(
            new QuestionSectionFactory(20, new TableMultiplyWithZerosFactory()),
            new QuestionSectionFactory(20, new TwoOneMultiplyQuestionFactory()),
            new QuestionSectionFactory(25, new TableDivideQuestionFactory()),
            new QuestionSectionFactory(20, new TableDivideWithRemainderQuestionFactory())
        );
    }
}
