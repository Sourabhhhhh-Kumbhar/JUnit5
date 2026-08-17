package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TestAssertTrue {

    @Test
    void testPositiveNumber() {
        AssertTrue obj = new AssertTrue();

        assertTrue(obj.isPositive(10));
    }

    @Test
    void testEvenNumber() {
        AssertTrue obj = new AssertTrue();

        assertTrue(obj.isEven(20));
    }
}