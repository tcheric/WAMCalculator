package src.test;

import org.junit.jupiter.api.Test;

import src.main.*;

public class ApplicationTest {
    @Test
    public void appTest(){
    // Make interface
    Interface testInterface = new Interface();
    // Use interface to make studentRecord
    StudentRecord testRecord = testInterface.newRecord();
    // Use interface to make term
    Term newTerm = testInterface.newTerm("21T1");
    // Use interface to add courses to term
    Course comp1511 = testInterface.addCourse("COMP1511", "21T1");
    Course math1131 = testInterface.addCourse("MATH1131", "21T1");
    // Attempt to add course to term that doesn't exist
    testInterface.addCourse("COMP2521", "22T1");
    // Use interface to add assessments to courses
    testInterface.addAssessment(comp1511, "Final Exam", 50, 100, 70);
    testInterface.addAssessment(comp1511, "Labs", 20, 40, 32);
    testInterface.addAssessment(comp1511, "Midterm Exam", 30, 100, 90);
    testInterface.addAssessment(math1131, "Tutorials", 20, 20, 18);
    testInterface.addAssessment(math1131, "Weekly quizzes", 20, 20, 15);
    testInterface.addAssessment(math1131, "Lab Test", 20, 100, 85);
    // Fail to add assessments
    testInterface.addAssessment(math1131, "Test", 101, 20, 20);
    testInterface.addAssessment(math1131, "Test", 50, 10, 11);
    testInterface.addAssessment(math1131, "Test", 41, 100, 98);
    // Use interface to print assessments in comp1511
    testInterface.printAssessments(comp1511);
    // Use interface to get final course WAM
    testInterface.getCourseWAM(comp1511);
    // Use interface to print assessments in math1131
    testInterface.printAssessments(math1131);
    // Use interface to get projected course WAM
    testInterface.getCourseWAM(math1131);
    // Use interface to print courses in term
    testInterface.printCourses(newTerm);
    // Use interface to get term WAM
    testInterface.getTermWAM(newTerm);
    }
}
