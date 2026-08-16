package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;

import static org.junit.jupiter.api.Assertions.*;

class TestShapes
{
    @Test
    void testcomputeSquareArea()
    {
        Shapes shapes = new Shapes();

        double actualResult = shapes.computeSquareArea(4);
        double expectedResult = 16;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void testcomputeCircleArea()
    {
        Shapes shapes = new Shapes();

        double actualResult = shapes.computeCircleArea(5);
        double expectedResult = 78.5;
        assertEquals(expectedResult,actualResult);
    }
}