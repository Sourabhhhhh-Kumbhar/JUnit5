package org.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class TestUser {

    User user = new User();

    @Nested
    class AgeTests {

        @Test
        void testAdult() {
            assertTrue(user.isAdult(25));
        }

        @Test
        void testMinor() {
            assertFalse(user.isAdult(15));
        }
    }

    @Nested
    class NameTests {

        @Test
        void testValidName() {
            assertTrue(user.isValidName("Rahul"));
        }

        @Test
        void testEmptyName() {
            assertFalse(user.isValidName(""));
        }
    }
}