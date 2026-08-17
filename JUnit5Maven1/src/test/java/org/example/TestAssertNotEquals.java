package org.example;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

public class TestAssertNotEquals {

    @Test
    void testSquare() {
        AssertNotEquals obj = new AssertNotEquals();

        assertNotEquals(20, obj.square(5));
    }

    @Test
    void testMultiply() {
        AssertNotEquals obj = new AssertNotEquals();

        assertNotEquals(15, obj.multiply(4, 5));
    }
}