package by.itacademy.course.academy;

public abstract class Human {

    private static int humanIdCount;

    private String name;
    private String sureName;
    private int age;
    private final int personalId;


    public Human(int id, String name, String sureName, int age) {
        this.name = name;
        this.sureName = sureName;
        this.age = age;
        this.personalId = id;
    }


    public static void increaseId() {
        humanIdCount++;
    }

    public static int getHumanId() {
        return humanIdCount;
    }

    public int getPersonalId() {
        return personalId;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public String getSureName() {
        return sureName;
    }

    public int getAge() {
        return age;
    }
}
