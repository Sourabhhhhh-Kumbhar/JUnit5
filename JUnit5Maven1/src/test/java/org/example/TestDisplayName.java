package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testing DisplayName Example")
class TestDisplayNameExample {

    @Test
    @DisplayName("Check if a person is eligible to vote")
    void testVotingEligibility() {
        DisplayNameExample obj = new DisplayNameExample();

        assertTrue(obj.isEligibleToVote(20));
    }

    @Test
    @DisplayName("Check the square of a number")
    void testSquare() {
        DisplayNameExample obj = new DisplayNameExample();

        assertEquals(25, obj.findSquare(5));
    }
}