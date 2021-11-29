package by.itacademy.course.academy;

//import java.util.ArrayList;
//import java.util.HashMap;

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

//        academy.addStudentToCourse(7, "Philosophy");
//        academy.addStudentToCourse(7, "Programming");
//        academy.addStudentToCourse(7, "Biology");
//        academy.addStudentToCourse(7, "Language");
//        academy.addStudentToCourse(7, "Sociology");
//        academy.addStudentToCourse(7, "Physic");
//
//        academy.addStudentToCourse(7, "Math");

//        academy.setMark(2, 7, 5, "Good student");
//        academy.setMark(3, 7, 7, "some feedback");

        System.out.println("Finished");

    }
}