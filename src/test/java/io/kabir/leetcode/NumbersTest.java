package io.kabir.leetcode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {
    Numbers numbers;
    @BeforeEach
    void setUp() {
        numbers = new Numbers();
    }

    @AfterEach
    void tearDown() {
        numbers = null;
    }

    @Test
    void reverse() {
        assertAll(
                ()->assertEquals(326, numbers.reverse(623)),
                ()->assertEquals(-793674, numbers.reverse(-476397)),
                ()->assertEquals(987654321, numbers.reverse(123456789)),
                ()->assertEquals(0, numbers.reverse(-1923456789)),
                ()->assertEquals(21, numbers.reverse(120)),
                ()->assertEquals(1, numbers.reverse(1)),
                ()->assertEquals(0, numbers.reverse(1534236469))
        );
    }
}