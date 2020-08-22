package io.kabir.leetcode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuySellStockTest {

    private BuySellStock platform = null;

    @BeforeEach
    void setUp() {
        platform = new BuySellStock();
    }

    @AfterEach
    void tearDown() {
        platform = null;
    }

    @Test
    void maxProfitRandom() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(5, platform.maxProfit(prices));
    }

    @Test
    void maxProfitDecline() {
        int[] prices = {7,6,4,3,1};
        assertEquals(0, platform.maxProfit(prices));
    }
}