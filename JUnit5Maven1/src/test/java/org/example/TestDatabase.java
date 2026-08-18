package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestDatabase {

    static Database database;

    @BeforeAll
    static void setUp() {
        database = new Database();
        database.connect();
        System.out.println("BeforeAll executed");
    }

    @Test
    void testConnectionStatus() {
        assertEquals("Connected", database.getStatus());
    }

    @Test
    void testConnectionAgain() {
        assertEquals("Connected", database.getStatus());
    }
}