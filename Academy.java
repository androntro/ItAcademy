package by.itacademy.course.academy;

import java.util.ArrayList;
import java.util.Scanner;

public class Academy {

    public static void main(String[] args) {
        Academy academy = new Academy();
        academy.go();

    }

    private void go() {
        ArrayList<Student> students = new ArrayList<>();
        boolean process = true;
        Scanner scanner = new Scanner(System.in);
        String name;
        String sureName;
        int age;


        while (process){

            System.out.println("Add Student Name");
            name = scanner.nextLine();
            System.out.println("Add Student SureName");
            sureName = scanner.nextLine();
            System.out.println("Add Student Age");
            age = scanner.nextInt();

            students.add(new Student(name, sureName, age));

        }

    }
}
