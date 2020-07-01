package io.kabir.maths;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    MathUtils mUtils = null;
    @BeforeEach
    void setUp() {
        mUtils = new MathUtils();
    }

    @AfterEach
    void tearDown() {
        mUtils = null;
    }

    @Test
    void testAdd() {
        assertEquals(5, mUtils.add(2,3));
        assertNotEquals(5, mUtils.add(7,3));
    }

    @Test
    void gcd() {
        int[] numArray1 = {2,3};
        int[] numArray2 = {20,30};
        int[] numArray3 = {3,9};
        assertEquals(1, mUtils.gcd(numArray1));
        assertEquals(10, mUtils.gcd(numArray2));
        assertEquals(3, mUtils.gcd(numArray3));
    }
}