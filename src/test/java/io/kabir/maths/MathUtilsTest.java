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
        int[] numArray2 = {20,40,60,70};
        int[] numArray3 = {3,9};
        int[] numArray4 = {3,9,6};
        int[] numArray5 = {3,9,6,12,15};
        int[] numArray0 = {};
        int[] numArrayWith0 = {2,6,10,0,20};
        assertEquals(1, mUtils.gcd(numArray1));
        assertEquals(10, mUtils.gcd(numArray2));
        assertEquals(3, mUtils.gcd(numArray3));
        assertEquals(3, mUtils.gcd(numArray4));
        assertEquals(3, mUtils.gcd(numArray5));
        assertThrows(IllegalArgumentException.class,()->mUtils.gcd(numArray0));
        assertThrows(IllegalArgumentException.class,()->mUtils.gcd(numArrayWith0));
    }

    @Test
    void getTwoSum(){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = {0,1};

        assertArrayEquals(result, mUtils.twoSum(nums,target));
     }

    @Test
    void getTwoSumSmallArray(){
        int[] nums = {3,3};
        int target = 6;
        int[] result = {0,1};

        assertArrayEquals(result, mUtils.twoSum(nums,target));
    }
}