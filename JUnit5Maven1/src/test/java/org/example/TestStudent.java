package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestStudent {

    Student student;

    @BeforeEach
    void setUp() {
        student = new Student();
        System.out.println("Student object created");
    }

    @Test
    void testGrade() {
        assertEquals("A", student.getGrade(95));
    }

    @Test
    void testPassed() {
        assertTrue(student.isPassed(70));
    }
}