package by.itacademy.course.academy;

import java.util.ArrayList;

public class Student extends Human{

   private ArrayList <Course> courses = new ArrayList<>();
   private ArrayList<Estimate> estimates = new ArrayList<>();

    public Student(int id, String name, String sureName, int age) {
        super(id, name, sureName, age);
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
