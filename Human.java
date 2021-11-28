package by.itacademy.course.academy;

public abstract class Human {

    private static int humanIdCount = 1;

    private String name;
    private String surname;
    private int age;
    private final int PERSONAL_ID;


    public Human(int id, String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.PERSONAL_ID = id;
        humanIdCount++;
    }



//    public static void increaseId() {
//        humanIdCount++;
//    }

    public static int getHumanId() {
        return humanIdCount;
    }

    public int getPersonalId() {
        return PERSONAL_ID;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void sen(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }


}
