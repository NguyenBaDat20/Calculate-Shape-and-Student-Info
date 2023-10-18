/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import model.Student;

/**
 *
 * @author admin
 */
public class ManagerStudent {

    Scanner sc = new Scanner(System.in);

    public boolean checkYesNo() {
        while (true) {
            String result = sc.nextLine();
            if (result.length() == 1 && result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.length() == 1 && result.equalsIgnoreCase("N")) {
                return false;
            }
        }
    }

    public float checkFloat() {
        String input = sc.nextLine();
        while (true) {
            try {
                float floatValue = Float.parseFloat(input);
                return floatValue;
            } catch (NumberFormatException e) {
                System.err.println(" Re-enter.");
                System.out.print("Input Again:");
                input = new Scanner(System.in).nextLine();
            }
        }
    }

    public void sortStudent(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        Collections.sort(students);
        for (int i = 0; i < students.size(); i++) {
            System.out.println("--------Student " + (i + 1) + "--------");
            System.out.println("Name: " + students.get(i).getName());
            System.out.println("Classes: " + students.get(i).getClasses());
            System.out.println("Mark: " + students.get(i).getMark());
        }
    }

    public void addStudent(ArrayList<Student> lt) {
        System.out.println("Please input student information ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Classes: ");
        String classes = sc.nextLine();
        System.out.print("Mark: ");
        float mark = checkFloat();
        lt.add(new Student(name, mark, classes));
    }

    public void display() {
        ArrayList<Student> students = new ArrayList<>();
        System.out.println("====== Collection Sort Program ======");
        addStudent(students);
        while (true) {
            System.out.print("Do you want to enter more student information?(Y/N): ");
            if (checkYesNo()) {
                addStudent(students);
            } else {
                break;
            }
        }
        sortStudent(students);
    }

}
