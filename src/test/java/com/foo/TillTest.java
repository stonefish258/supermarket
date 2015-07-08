package com.foo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TillTest {


    private static final double DELTA = 0.009;

    @Test
    public void emptyBasketHasZeroTotalCost() {

        // given
        Till till = new Till();
        String[] emptyBasket = {};

        // when
        double total = till.calculateTotal(emptyBasket);

        // then
        assertEquals(0, total, DELTA);
    }
}
