package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestStudentResult {

    @ParameterizedTest
    @CsvSource({
            "95, A",
            "80, B",
            "60, C",
            "30, F"
    })
    void testGrade(int marks, String expectedGrade) {

        StudentResult obj = new StudentResult();

        assertEquals(expectedGrade, obj.getGrade(marks));
    }
}