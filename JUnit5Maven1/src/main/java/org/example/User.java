package org.example;

public class User {

    public boolean isAdult(int age) {
        return age >= 18;
    }

    public boolean isValidName(String name) {
        return name != null && !name.isEmpty();
    }
}