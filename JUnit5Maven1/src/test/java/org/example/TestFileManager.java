package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

public class TestFileManager {

    static FileManager fileManager;

    @Test
    void testOpenFile() {
        fileManager = new FileManager();

        assertEquals("File opened", fileManager.openFile());
    }

    @Test
    void testCloseFile() {
        fileManager = new FileManager();

        assertEquals("File closed", fileManager.closeFile());
    }

    @AfterAll
    static void tearDown() {
        fileManager = null;
        System.out.println("AfterAll executed - cleanup completed");
    }
}