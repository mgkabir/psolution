package io.kabir.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaygroundTest {

    Playground playground = null;

    @BeforeEach
    void setup() {
        playground = new Playground();
    }

    @Test
    void negativeSubArrayNumber() {
        int[] myArray = {1, -2, 4, -5, 1};
        assertEquals(9, playground.negativeSubArrayNumber(myArray));
    }

    @Test
    void testSquredSortedArray() {
        int[] input = {-4, -1, 0, 3, 10};
        int[] expectedOutput = {0, 1, 9, 16, 100};
        assertArrayEquals(expectedOutput, playground.squredSortedArray(input));
    }

    @Test
    void testDuplicateZero() {
        int[] inputArr1 = {4, 1, 0, 3, 10};
        int[] outputArr1 = {4, 1, 0, 0, 3};

        int[] inputArr2 = {4, 1, 0, 3, 0, 10, 20, 5};
        int[] outputArr2 = {4, 1, 0, 0, 3, 0, 0, 10};

        assertArrayEquals(outputArr1, playground.duplicateZeros(inputArr1));
        assertArrayEquals(outputArr2, playground.duplicateZeros(inputArr2));
    }

    @Test
    void testMergeSort() {
        int[] nums1 = {5, 8, 9};
        int[] nums2 = {2, 7, 10, 12};
        int[] expected = {2, 5, 7, 8, 9, 10, 12};

        assertArrayEquals(expected, playground.mergeSort(nums1, nums2));

        int[] arr1 = {5, 8, 9, 13};
        int[] arr2 = {2, 7, 10, 12, 13, 15};
        int[] out = {2, 5, 7, 8, 9, 10, 12, 13, 13, 15};

        assertArrayEquals(out, playground.mergeSort(arr1, arr2));
    }

    @Test
    void testLongestCommonPrifix() {
        String[] strs = {"flower", "flow", "floride"};
        String[] strs2 = {"abca", "abc"};
        String[] arrWithEmptyStr = {"flower", "", "floride"};
        String[] emptyStrs = {};
        String[] oneStr = {"single"};
        String[] singleCharStrs = {"c","c"};
        assertEquals("", playground.longestCommonPrefix(emptyStrs));
        assertEquals(oneStr[0], playground.longestCommonPrefix(oneStr));
        assertEquals("", playground.longestCommonPrefix(arrWithEmptyStr));
        assertThrows(IllegalArgumentException.class, () -> playground.longestCommonPrefix(null));
        assertEquals("flo", playground.longestCommonPrefix(strs));
        assertEquals("c", playground.longestCommonPrefix(singleCharStrs));
        assertEquals("abc", playground.longestCommonPrefix(strs2));

    }
}