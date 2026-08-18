package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;

public class TestDiscount {

    @Test
    void testDiscountForLargeOrder() {

        int price = 1000;

        assumeTrue(price >= 500);

        Discount obj = new Discount();

        assertEquals(900, obj.calculateDiscount(price));
    }

    @Test
    void testDiscountForSmallOrder() {

        int price = 300;

        assumeTrue(price >= 500);

        Discount obj = new Discount();

        assertEquals(200, obj.calculateDiscount(price));
    }
}