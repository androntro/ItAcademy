package by.itacademy.course.academy;

public class Course {

    String courseName;
    Teacher teacher;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getCourseName() {
        return courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}