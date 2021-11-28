package by.itacademy.course.academy;

public class Mark {

    private int value;
    private Course course;
    private Teacher teacher;
    private String feedback;

    public Mark(Teacher teacher, Course course, int i, String feedback) {
        this.course = course;
        this.value = i;
        this.teacher = teacher;
        this.feedback = feedback;


    }

    public Course getCourse() {
        return course;
    }

    public int getValue() {
        return value;
    }

    public String getFeedback() {
        return feedback;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
