package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class TestShoppingCart {

    ShoppingCart cart = new ShoppingCart();

    @Test
    void testAddItem() {
        cart.addItem("Laptop");

        assertEquals(1, cart.getItemCount());
    }

    @Test
    void testAddMultipleItems() {
        cart.addItem("Phone");
        cart.addItem("Headphones");

        assertEquals(2, cart.getItemCount());
    }

    @AfterEach
    void tearDown() {
        cart.clearCart();
        System.out.println("Cart cleared after test");
    }
}