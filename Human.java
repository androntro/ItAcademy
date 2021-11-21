package by.itacademy.course.academy;

public abstract class  Human {

    private String name;
    private String sureName;
    private int age;
    private int id;


    public Human(int id, String name, String sureName, int age) {
        this.name = name;
        this.sureName = sureName;
        this.age = age;
        this.id = id;
    }

    public int getId(){
     return id;
    }


//    public void setName(String name) {
//        this.name = name;
//    }
//    public void setSureName(String sureName) {
//        this.sureName = sureName;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//

//    public String getSureName() {
//        return sureName;
//    }
//    public int getAge() {
//        return age;
//    }
}
