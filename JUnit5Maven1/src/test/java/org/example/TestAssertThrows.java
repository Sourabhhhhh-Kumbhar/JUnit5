package org.example;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class TestAssertThrows {

    @Test
    void testDivideByZero() {
        AssertThrows obj = new AssertThrows();

        assertThrows(ArithmeticException.class, () -> {
            obj.divide(10, 0);
        });
    }

    @Test
    void testInvalidAge() {
        AssertThrows obj = new AssertThrows();

        assertThrows(IllegalArgumentException.class, () -> {
            obj.checkAge(15);
        });
    }
}