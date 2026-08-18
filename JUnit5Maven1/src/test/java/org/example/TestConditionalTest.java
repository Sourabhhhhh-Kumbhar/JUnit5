package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class TestConditionalTest {

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void testOnJava17() {
        ConditionalTest obj = new ConditionalTest();

        assertEquals("Test is running", obj.getMessage());
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testOnWindows() {
        ConditionalTest obj = new ConditionalTest();

        assertEquals("Test is running", obj.getMessage());
    }
}