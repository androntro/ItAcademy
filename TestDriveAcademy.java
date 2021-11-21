package by.itacademy.course.academy;

import java.util.ArrayList;
import java.util.HashMap;

public class TestDriveAcademy extends Academy{

    public static void main(String[] args) {
        //add test humen
        TestDriveAcademy td = new TestDriveAcademy();
        td.go();


    }

    public void go(){
        Academy academy = new Academy();
        academy.go();

        students = new ArrayList<>();
        teachers = new ArrayList<>();
        courses = new HashMap<String, Course>();



        addStudent("Anton","First", 22);
        addStudent("Boris","Second", 23);

        addTeacher("Alexandr", "Fteacher", 52);
        addTeacher("Benya", "Steacher", 84);

        addCourse("Philosophy");
        addCourse("Biology");

        pairCourseTeacher(2, "Philosophy");
        pairCourseTeacher(3,"Math");

        addStudentToCourse(0,"Philosophy");
        addStudentToCourse(0,"Math");

        setEstimate(2,0,5);
        setEstimate(3,1,7);

        System.out.println("Finished");

    }
}
