package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TestAssertTrue2 {

    @Test
    void testLongName() {
        AssertTrue2 obj = new AssertTrue2();

        assertTrue(obj.isLongName("RahulKumar"));
    }

    @Test
    void testStartsWithA() {
        AssertTrue2 obj = new AssertTrue2();

        assertTrue(obj.startsWithA("Amit"));
    }
}