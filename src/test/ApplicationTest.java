package src.test;

import src.main.*;

public class ApplicationTest {
    // Make interface
    Interface testInterface = new Interface();
    // Use interface to make studentRecord
    StudentRecord testRecord = testInterface.newRecord();
    // Use interface to make term
    Term newTerm = testInterface.newTerm("21T1");
    // Use interface to add courses to term
    Course comp1511 = testInterface.addCourse("COMP1511", "21T1");
    Course math1131 = testInterface.addCourse("MATH1131", "21T1");
    // Use interface to add assessments to courses
    // Use interface to print assessments in a course
    // Use interface to get term WAM
}
