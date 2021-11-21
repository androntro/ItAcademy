package by.itacademy.course.academy;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Academy {

    int id = 0;
    ArrayList<Student> students;
    ArrayList<Teacher> teachers;
    HashMap <String, Course> courses;

    public static void main(String[] args) {
        Academy academy = new Academy();
        academy.go();

    }

    protected void go() {

        students = new ArrayList<>();
        teachers = new ArrayList<>();
        courses = new HashMap<String, Course>();
        boolean process = true;
        Scanner scanner = new Scanner(System.in);
        String name;
        String sureName;
        int age;

    }

    protected void pairCourseTeacher(int idTeacher, String courseName) {
        Teacher fTeacher = null;
        Course fCourse = null;

        for (Teacher t: teachers) {
            if(t.getId() == (idTeacher)){fTeacher = t;}
        }

        fCourse = (Course)courses.get(courseName);

        if(fTeacher == null){
            System.out.println("Teacher not found");
            return;
        }else if(fCourse == null){
            System.out.println("Course not found");
            return;
        }else{
            fTeacher.setCourse(fCourse);
            fCourse.setTeacher(fTeacher);
        }

    }

    protected void addTeacher(String name, String sureName, int age) {
        teachers.add(new Teacher(id, name, sureName, age));
        id++;
    }

    protected void addStudent(String name, String sureName, int age){
        students.add(new Student(id, name, sureName, age));
        id++;
    }

    protected void addCourse(String courseName){
        courses.put(courseName, new Course(courseName));
    }

    protected void setEstimate(int teacherId, int studentId, int estimateValue ){
        Teacher t = null;
        Student s = null;

        for (Teacher teacher: teachers) {
            if(teacher.getId()==teacherId){
                t=teacher;
            }
        }
        for(Student student : students){
            if (student.getId() == studentId){
                s=student;
            }
        }

        if(s == null){
            System.out.println("Student not found");
            return;
        }else if (t == null){
            System.out.println("Teacher not found");
            return;
        }else{t.setEstimate(s,estimateValue);
        }

    }

    protected void addStudentToCourse(int studentId, String courseName){
        Student s = null;
        Course c = null;

        for(Student student : students){
            if (student.getId() == studentId){
                s=student;
            }
        }
        c = (Course)courses.get(courseName);

        if(s == null){
            System.out.println("Student not found");
            return;
        }else if (c == null){
            System.out.println("Course not found");
            return;
        }else{s.addCourse(c);
        }
   }

}
