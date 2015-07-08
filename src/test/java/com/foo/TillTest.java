package com.foo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TillTest {

    private Till till;

    private static final double DELTA = 0.009;

    @Before
    public void setup() {
        till = new Till();
    }

    @Test
    public void emptyBasketHasZeroTotalCost() {

        // given
        String[] emptyBasket = {};

        // when
        double total = till.calculateTotal(emptyBasket);

        // then
        assertEquals(0, total, DELTA);
    }

    @Test
    public void basketContainingOneAppleShouldCostSixtyPence() {

        // given
        String[] basket = {"Apple"};

        // when
        double total = till.calculateTotal(basket);

        // then
        assertEquals(0.60d, total, DELTA);
    }

    @Test
    public void basketContainingOneOrangeShouldCostTwentyFivePence() {

        // given
        String[] basket = {"Orange"};

        // when
        double total = till.calculateTotal(basket);

        // then
        assertEquals(0.25d, total, DELTA);
    }

}
