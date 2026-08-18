package org.example;

import java.util.Random;

public class RandomNumber {

    public int generateNumber() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }
}