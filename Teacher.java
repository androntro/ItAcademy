package by.itacademy.course.academy;

public class Teacher extends Human {

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

    public void setMark(Student s, int estimateValue) {
        //todo check if the same mark exists the reset or cancel operation
        if (s.getCourses().contains(course)) {
            s.setMark(new Mark(this, course, estimateValue));
        } else {
            System.out.println("Student doesn't join this course");
        }
    }


}
