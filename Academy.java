package by.itacademy.course.academy;

import java.util.*;


public class Academy {


    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;
    private HashMap<String, Course> courses;

    public static void main(String[] args) {
        Academy academy = new Academy();
        academy.create();
        academy.run();

    }

    protected void create() {

        courses = new HashMap<String, Course>();
        teachers = new ArrayList<>();
        students = new ArrayList<>();


        addCourse("Philosophy");
        addCourse("Programming");
        addCourse("Biology");
        addCourse("Language");
        addCourse("Sociology");
        addCourse("Physic");

        addTeacher("Alexandr", "Fteacher", 52);
        addTeacher("Benya", "Steacher", 84);
        addTeacher("Collito", "Italian", 32);
        addTeacher("Denim", "Tornado", 50);
        addTeacher("Egor", "Mudko", 52);
        addTeacher("Fernando", "Alonso", 44);

        addStudent("Anton", "First", 18);
        addStudent("Boris", "Second", 19);
        addStudent("Cop", "Ment", 20);
        addStudent("Derby", "Ryan", 21);
        addStudent("Emelya", "Pechnik", 22);
        addStudent("Frosya", "Polotskaya", 23);

        mapTeacherToCourse(6, "Physic");
        mapTeacherToCourse(5, "Philosophy");
        mapTeacherToCourse(4, "Programming");
        mapTeacherToCourse(3, "Biology");
        mapTeacherToCourse(2, "Language");
        mapTeacherToCourse(1, "Sociology");


        //__________________________________________________

        processAddStudentToCourse((Student) getHumanById(students, 7), getCourseByCourseName("Philosophy"));
        processAddStudentToCourse((Student) getHumanById(students, 7), getCourseByCourseName("Programming"));
        processAddStudentToCourse((Student) getHumanById(students, 7), getCourseByCourseName("Biology"));
        processAddStudentToCourse((Student) getHumanById(students, 7), getCourseByCourseName("Language"));
        processAddStudentToCourse((Student) getHumanById(students, 7), getCourseByCourseName("Sociology"));
        processAddStudentToCourse((Student) getHumanById(students, 7), getCourseByCourseName("Physic"));

        //

    }

    private void run() {

        clearScreen();
        System.out.println("Welcome to our academy! \n");

        int menu;

        do {
            System.out.println("\n");
            printMenu();
            menu = getMenuPoint();
            switch (menu) {
                case 1:
                    printAllCourses();
                    break;
                case 2:
                    printAllTeachers();
                    break;
                case 3:
                    printAllStudents();
                    break;
                case 4:
                    getStudentInfoById();
                    break;
                case 5:
                    addStudentToCourse();
                    break;
                case 6:
                    addNewStudent();
                    break;
                case 7:
                    setMark();
                    break;
                case 8:
                    return;
                default:
                    clearScreen();
                    System.out.println();

            }
        } while (menu != 0);
    }


    private void addNewStudent() {

        clearScreen();
        System.out.println("Enter new student name:");
        String name = getStringFromConsole();
        System.out.println("Enter new student surname:");
        String surname = getStringFromConsole();
        int age = 0;

        do {
            System.out.println("Enter new student age");
            int gotAgeFromUser = getIntFromConsole();
            age = (gotAgeFromUser > 15 && gotAgeFromUser < 100) ? gotAgeFromUser : 0;

        } while (age == 0);

        addStudent(name, surname, age);
        System.out.println("New student has been added");

    }

    private void getStudentInfoById() {

        printAllStudents();
        int id = getIdFromConsole("student");
        Human h = getHumanById(students, id);
        if (h == null) {
            System.out.println("\nStudent with id " + id + " doesn't exist");
            return;
        } else {
            Student s = (Student) h;
            System.out.println("\nStudent's name: " + s.getName() + "; Surname: " + s.getSurname() + "; age : " + s.getAge());
            System.out.println("Joins courses :");
            for (Course course : s.getCourses()) {
                System.out.println(course.getCourseName());
            }
            System.out.println("\nHas marks: \n");
            for (Mark mark : s.getMarks()) {
                System.out.println("Course : " + mark.getCourse().getCourseName() + "; Teacher : " + mark.getTeacher().getName() + " " +
                        mark.getTeacher().getSurname() + "; mark : " + mark.getValue() + ";\nfeedback : " + mark.getFeedback() + ".\n");
            }
        }
    }


    private Human getHumanById(ArrayList list, int id) {

        Human human;
        Iterator<Human> it = list.iterator();
        while (it.hasNext()) {
            human = it.next();
            if (id == human.getPersonalId()) {
                return human;
            }
        }
        return null;
    }

    private int getIdFromConsole(String typeOfHuman) {

        int gotId;
        do {
//            clearScreen();
            System.out.println("Enter id of " + typeOfHuman);
            int selectedIntFromConsole = getIntFromConsole();
            gotId = selectedIntFromConsole <= 0 ? 0 : selectedIntFromConsole;

        } while (gotId == 0);

        return gotId;
    }


    private void printAllTeachers() {

        for (Teacher t : teachers) {
            System.out.println("Id : " + t.getPersonalId() + "; Name : " + t.getName() + "; Surname : " + t.getSurname() + "; age : " + t.getAge() +
                    "; course : " + t.getCourse().getCourseName() + ";");
        }
    }

    private void printAllStudents() {

        for (Student s : students) {

            System.out.println("Id : " + s.getPersonalId() + "; Name : " + s.getName() + "; Surname : " + s.getSurname() + "; age : " + s.getAge() + ";");
        }
    }

    private void printAllCourses() {

        courses.forEach((s, c) -> System.out.println("Course name: " + s));

    }


    private int getMenuPoint() {

        int selectedMenuPointFromUser;
        selectedMenuPointFromUser = getIntFromConsole();
        return (selectedMenuPointFromUser < 1 || selectedMenuPointFromUser > 9) ? 0 : selectedMenuPointFromUser;
    }


    private int getIntFromConsole() {

        Scanner scanner = new Scanner(System.in);
        return (scanner.hasNextInt()) ? scanner.nextInt() : 0;
    }


    private void clearScreen() {

        //this method doesn't really clear screen. but make  some new text  more noticeable
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }
    }


    private void printMenu() {

        System.out.println("1. Get all courses");
        System.out.println("2. Get all teachers");
        System.out.println("3. Get all students");
        System.out.println("4. Get student info by id");
        System.out.println("5. Add student to course");
        System.out.println("6. Add new student");
        System.out.println("7. Set mark to student");
        System.out.println("8. Exit");
    }


    private Course getCourseByCourseName(String courseName) {

        Course course = null;
        for (Map.Entry<String, Course> entry : courses.entrySet()) {
            if (courseName.equals(entry.getKey())) {
                course = entry.getValue();
                break;
            }
        }
        return course;
    }


    private void mapTeacherToCourse(int idTeacher, String courseName) {

        Teacher foundTeacher = null;
        Course foundCourse = null;

        for (Teacher t : teachers) {
            if (t.getPersonalId() == (idTeacher)) {
                foundTeacher = t;
                break;
            }
        }

        foundCourse = courses.get(courseName);

        if (foundTeacher == null) {
            System.out.println("Teacher not found");
            return;
        } else if (foundCourse == null) {
            System.out.println("Course not found");
            return;
        } else {
            foundTeacher.setCourse(foundCourse);
            foundCourse.setTeacher(foundTeacher);
        }
    }


    private void addTeacher(String name, String surname, int age) {
        teachers.add(new Teacher(Human.getHumanId(), name, surname, age));

    }


    private void addStudent(String name, String surname, int age) {
        students.add(new Student(Human.getHumanId(), name, surname, age));

    }


    private void addCourse(String courseName) {
        courses.put(courseName, new Course(courseName));
    }


    private String getStringFromConsole() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        return string;
    }

    private void setMark() {

        Teacher teacher;
        Student student;

        printAllTeachers();
        System.out.println();
        int teacherId = getIdFromConsole("teacher");
        Human human = getHumanById(teachers, teacherId);
        if (human == null) {
            System.out.println("Teacher with this id doesn't exist");
            return;
        } else {
            teacher = (Teacher) human;
        }

        printAllStudents();
        System.out.println();
        int studentId = getIdFromConsole("student");
        human = getHumanById(students, studentId);
        if (human == null) {
            System.out.println("Student with this id doesn't exist");
            return;
        } else {
            student = (Student) human;
        }
        int markValue;
        do {
            clearScreen();
            System.out.println("Set mark (1-10) to student");
            int gotMarkValue = getIntFromConsole();
            markValue = gotMarkValue < 1 || gotMarkValue > 10 ? 0 : gotMarkValue;

        } while (markValue == 0);

        String feedback;
        clearScreen();
        System.out.println("Write feedback");
        feedback = getStringFromConsole();
        teacher.setMark(student, markValue, feedback);

    }


    private void addStudentToCourse() {

        printAllStudents();
        int studentId = getIdFromConsole("student");

        Human h = getHumanById(students, studentId);
        if (h == null) {
            System.out.println("Student with this id doesn't exist");
            return;
        }
        Student student = (Student) h;

        Course course = null;
        course = getCourseNameFromUser();
        processAddStudentToCourse(student, course);

    }


    private void processAddStudentToCourse(Student student, Course course) {

        student.addCourse(course);
        System.out.println("Student has been added to course");
    }


    private Course getCourseNameFromUser() {

        Course course = null;

        do {
            clearScreen();

            System.out.println("Enter course name: \n");
            System.out.println("Available courses");
            printAllCourses();
            String courseNameFromUser = getStringFromConsole();

            course = getCourseByCourseName(courseNameFromUser);
        } while (course == null);

        return course;
    }
}