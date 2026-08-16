package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestShapess
{
    @Test
    void computeSquareArea()
    {
        Shapess shapes = new Shapess();

        assertEquals(16.0,shapes.computeSquareArea(4.0));
    }

    @Test
    void computeCircleArea()
    {
        Shapess shapes = new Shapess();

        assertEquals(78.5,shapes.computeCircleArea(5));
    }
}
