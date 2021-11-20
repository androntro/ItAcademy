package by.itacademy.course.academy;

import java.util.ArrayList;

public class Student extends Human{

    ArrayList <Course> courses = new ArrayList<>();
    ArrayList<Estimate> estimates = new ArrayList<>();

    public Student(String name, String sureName, int age) {
        super(name, sureName, age);
    }


    public void addCourse(Course c) {
        courses.add(c);
    }

    public void addEstimate(Estimate e){
        estimates.add(e);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<Estimate> getEstimates() {
        return estimates;
    }
}
