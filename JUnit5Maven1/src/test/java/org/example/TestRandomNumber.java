package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.RepeatedTest;

public class TestRandomNumber {

    @RepeatedTest(5)
    void testRandomNumber() {

        RandomNumber obj = new RandomNumber();

        int number = obj.generateNumber();

        assertTrue(number >= 1 && number <= 10);
    }
}