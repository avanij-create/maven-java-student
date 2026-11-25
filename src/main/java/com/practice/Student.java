package com.practice;

public class Student {
    private final int rollNumber;
    private final String name;
    private final int marks;

    public Student(int rollNumber, String name, int marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        String result = marks >= 40 ? "PASS" : "FAIL";
        return rollNumber + " | " + name + " | " + marks + " | " + result;
    }
}
