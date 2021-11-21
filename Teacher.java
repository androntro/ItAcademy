package by.itacademy.course.academy;

public class Teacher extends Human{

    private Course course;

    public Teacher(int id, String name, String sureName, int age) {
        super(id, name, sureName, age);
    }




    public void setCourse(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public void setEstimate(Student s, int estimateValue){
        if(s.getCourses().contains(course)) {
            s.addEstimate(new Estimate(this, course, estimateValue));
        }else {
            System.out.println("Student doesn't join this course");
        }
    }


}
