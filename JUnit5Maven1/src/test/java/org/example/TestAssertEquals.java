package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestAssertEquals
{
    @Test
    void testAdd() {
        AssertEquals calculator = new AssertEquals();

        assertEquals(30, calculator.add(20,10));
    }

    @Test
    void testSubtract() {
        AssertEquals calculator = new AssertEquals();

        assertEquals(10, calculator.subtract(20,10));
    }
}
