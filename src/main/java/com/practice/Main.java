package com.practice;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student(101, "Asha", 88),
            new Student(102, "Ravi", 76),
            new Student(103, "Meera", 93)
        );

        System.out.println("STUDENT RESULT REPORT");
        System.out.println("---------------------");
        for (Student student : students) {
            System.out.println(student);
        }
        double average = students.stream()
                .mapToInt(Student::getMarks)
                .average()
                .orElse(0.0);
        System.out.printf("Class average: %.2f%n", average);
    }
}
