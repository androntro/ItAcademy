package by.itacademy.course.academy;

public class Mark {

    private int value;
    private Course course;
    private Teacher teacher;
    private String feedback;

    public Mark(Teacher teacher, Course course, int i) {
        this.course = course;
        this.value = i;
        this.teacher = teacher;

    }
}
