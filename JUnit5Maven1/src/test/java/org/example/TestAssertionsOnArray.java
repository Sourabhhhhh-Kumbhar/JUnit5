package org.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TestAssertionsOnArray {

    @Test
    void shouldSortArray() {
        int[] input = {5, 2, 8, 1, 3};
        int[] expected = {1, 2, 3, 5, 8};

        int[] actual = AssertionsOnArray.sortArray(input);

        assertArrayEquals(expected, actual);
    }
}
