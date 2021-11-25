package by.itacademy.course.academy;

//import java.util.ArrayList;
//import java.util.HashMap;

import by.itacademy.course.tests.MyRunnable1;

public class TestDriveAcademy extends Academy {

    public static void main(String[] args) {
        //add test humen
        TestDriveAcademy tda = new TestDriveAcademy();
        tda.run();


    }

    public void run() {
        Academy academy = new Academy();
        academy.create();
        //academy.run();

//        students = new ArrayList<>();
//        teachers = new ArrayList<>();
//        courses = new HashMap<String, Course>();


//        addStudent("Anton", "First", 22);
//        addStudent("Boris", "Second", 23);

//        addTeacher("Alexandr", "Fteacher", 52);
//        addTeacher("Benya", "Steacher", 84);

//        addCourse("Philosophy");
//        addCourse("Biology");

//        mapTeacherToCourse(2, "Philosophy");
//        mapTeacherToCourse(3, "Math");

        academy.addStudentToCourse(6, "Philosophy");
        academy.addStudentToCourse(6, "Programming");
        academy.addStudentToCourse(6, "Biology");
        academy.addStudentToCourse(6, "Language");
        academy.addStudentToCourse(6, "Sociology");
        academy.addStudentToCourse(6, "Physic");

        academy.addStudentToCourse(6, "Math");

        academy.setMark(2, 6, 5);
        academy.setMark(3, 8, 7);


       // System.out.println("Finished");

    }
}