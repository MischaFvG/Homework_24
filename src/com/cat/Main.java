package com.cat;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Alexander", 33));
        studentList.add(new Student(2, "Alberto", 20));
        studentList.add(new Student(3, "Miguel", 32));
        studentList.add(new Student(1, "Nicolas", 25));
        studentList.add(new Student(3, "Olga", 33));
        System.out.println(studentList);
        System.out.println(returnWithoutDuplicates(studentList));
    }

    public static List<Student> returnWithoutDuplicates(List<Student> studentList) {
        HashSet<Student> studentHashSet = new LinkedHashSet<>();
        studentHashSet.addAll(studentList);
        List<Student> students = new ArrayList<>();
        students.addAll(studentHashSet);
        return students;
    }
}
