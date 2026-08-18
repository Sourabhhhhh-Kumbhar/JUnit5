package org.example;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class TestAssertTimeout {

    @Test
    void testCalculateSum() {
        AssertTimeout obj = new AssertTimeout();

        assertTimeout(Duration.ofSeconds(2), () -> {
            obj.calculateSum(1000);
        });
    }
}