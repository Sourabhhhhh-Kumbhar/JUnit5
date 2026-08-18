package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestNumberChecker {

    @ParameterizedTest
    @ValueSource(ints = {1, 5, 10, 25, 100})
    void testPositiveNumbers(int number) {

        NumberChecker obj = new NumberChecker();

        assertTrue(obj.isPositive(number));
    }
}