package by.itacademy.course.academy;

public class Estimate {

    int value;
    Course course;
    Teacher teacher;

    public Estimate(Teacher teacher, Course course, int i) {
        this.course = course;
        this.value = i;
        this.teacher = teacher;
    }
}
