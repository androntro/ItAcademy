package by.itacademy.course.academy;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Academy {
    //protected int id;
    protected ArrayList<Student> students;
    protected ArrayList<Teacher> teachers;
    protected HashMap<String, Course> courses;

    public static void main(String[] args) {
        Academy academy = new Academy();
        academy.create();
        academy.run();

    }

    protected void create() {

        courses = new HashMap<String, Course>();
        teachers = new ArrayList<>();
        students = new ArrayList<>();


        addCourse("Philosophy");
        addCourse("Programming");
        addCourse("Biology");
        addCourse("Language");
        addCourse("Sociology");
        addCourse("Physic");

        addTeacher("Alexandr", "Fteacher", 52);
        addTeacher("Benya", "Steacher", 84);
        addTeacher("Collito", "Italian", 32);
        addTeacher("Denim", "Tornado", 50);
        addTeacher("Egor", "Mudko", 52);
        addTeacher("Fernando", "Alonso", 44);

        addStudent("Anton", "First", 18);
        addStudent("Boris", "Second", 19);
        addStudent("Cop", "Ment", 20);
        addStudent("Derby", "Ryan", 21);
        addStudent("Emelya", "Pechnik", 22);
        addStudent("Frosya", "Polotskaya", 23);

        mapTeacherToCourse(5, "Philosophy");
        mapTeacherToCourse(4, "Programming");
        mapTeacherToCourse(3, "Biology");
        mapTeacherToCourse(2, "Language");
        mapTeacherToCourse(1, "Sociology");
        mapTeacherToCourse(0, "Physic");


    }

    protected void run() {


        boolean process = true;
        Scanner scanner = new Scanner(System.in);
        String name;
        String sureName;
        int age;

    }

    //todo rebuild method to short
    protected void mapTeacherToCourse(int idTeacher, String courseName) {
        Teacher findTeacher = null;
        Course findCourse = null;

        for (Teacher t : teachers) {
            if (t.getPersonalId() == (idTeacher)) {
                findTeacher = t;
                break;
            }
        }

        findCourse = courses.get(courseName);

        if (findTeacher == null) {
            System.out.println("Teacher not found");
            return;
        } else if (findCourse == null) {
            System.out.println("Course not found");
            return;
        } else {
            findTeacher.setCourse(findCourse);
            findCourse.setTeacher(findTeacher);
        }

    }

    protected void addTeacher(String name, String sureName, int age) {
        teachers.add(new Teacher(Human.getHumanId(), name, sureName, age));
        Human.increaseId();
    }

    protected void addStudent(String name, String sureName, int age) {
        students.add(new Student(Human.getHumanId(), name, sureName, age));
        Human.increaseId();
    }

    protected void addCourse(String courseName) {
        courses.put(courseName, new Course(courseName));
    }

    protected void setMark(int teacherId, int studentId, int markValue) {
        Teacher t = null;
        Student s = null;

        for (Teacher teacher : teachers) {
            if (teacher.getPersonalId() == teacherId) {
                t = teacher;
                break;
            }
        }
        for (Student student : students) {
            if (student.getPersonalId() == studentId) {
                s = student;
                break;
            }
        }

        if (s == null) {
            System.out.println("Student not found");
            return;
        } else if (t == null) {
            System.out.println("Teacher not found");
            return;
        } else {
            t.setMark(s, markValue);
        }

    }

    protected void addStudentToCourse(int studentId, String courseName) {
        Student s = null;
        Course c = null;

        for (Student student : students) {
            if (student.getPersonalId() == studentId) {
                s = student;
                break;
            }
        }
        c = courses.get(courseName);

        if (s == null) {
            System.out.println("Student not found");
            return;
        } else if (c == null) {
            System.out.println("Course not found");
            return;
        } else {
            s.addCourse(c);
        }
    }

}