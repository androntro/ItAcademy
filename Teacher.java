package by.itacademy.course.academy;

public class Teacher extends Human{

    private Course course;

    public Teacher(String name, String sureName, int age) {
        super(name, sureName, age);
    }


    public void setCourse(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public void setEstimate(Student s){
        s.addEstimate(new Estimate(5));
    }
}
