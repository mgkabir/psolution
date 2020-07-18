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
        assertEquals(5, mUtils.add(2, 3));
        assertNotEquals(5, mUtils.add(7, 3));
    }

    @Test
    void gcd() {
        int[] numArray1 = {2, 3};
        int[] numArray2 = {20, 40, 60, 70};
        int[] numArray3 = {3, 9};
        int[] numArray4 = {3, 9, 6};
        int[] numArray5 = {3, 9, 6, 12, 15};
        int[] numArray0 = {};
        int[] numArrayWith0 = {2, 6, 10, 0, 20};
        assertEquals(1, mUtils.gcd(numArray1));
        assertEquals(10, mUtils.gcd(numArray2));
        assertEquals(3, mUtils.gcd(numArray3));
        assertEquals(3, mUtils.gcd(numArray4));
        assertEquals(3, mUtils.gcd(numArray5));
        assertThrows(IllegalArgumentException.class, () -> mUtils.gcd(numArray0));
        assertThrows(IllegalArgumentException.class, () -> mUtils.gcd(numArrayWith0));
    }

    @Test
    void getTwoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = {0, 1};

        assertArrayEquals(result, mUtils.twoSum(nums, target));
    }

    @Test
    void getTwoSumSmallArray() {
        int[] nums = {3, 3};
        int target = 6;
        int[] result = {0, 1};

        assertArrayEquals(result, mUtils.twoSum(nums, target));
    }


    @Test
    void testMyPow() {
        assertAll(
                () -> assertEquals(0, mUtils.myPow(0, 3)),
                () -> assertEquals(1, mUtils.myPow(2, 0)),
                () -> assertEquals(8, mUtils.myPow(2, 3)),
                () -> assertEquals(27, mUtils.myPow(3, 3)),
                () -> assertEquals(1024.00, mUtils.myPow(2.0, 10)),
                () -> assertEquals(0.25, mUtils.myPow(2, -2)),
                () -> assertEquals(9.26100, mUtils.myPow(2.1, 3),0.00001),
                () -> assertEquals(Math.pow(0.00001,2147483647), mUtils.myPow(0.00001, 2147483647)),
                () -> assertEquals(Math.pow(-2.00001,2), mUtils.myPow(-2.00001,2), 0.00001),
                () -> assertEquals(Math.pow(-2,2), mUtils.myPow(-2,2)),
                () -> assertEquals(Math.pow(-2,3), mUtils.myPow(-2,3))
        );
    }
}