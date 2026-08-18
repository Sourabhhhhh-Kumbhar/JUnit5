package org.example;

public class Student {

    public String getGrade(int marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "Fail";
        }
    }

    public boolean isPassed(int marks) {
        return marks >= 50;
    }
}