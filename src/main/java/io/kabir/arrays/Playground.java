package io.kabir.arrays;

import java.util.Arrays;

public class Playground {

    /**
     * @param myArray
     * @return number of subArrays that results to negative number when all
     * the elemenst are added together
     */
    public int negativeSubArrayNumber(int[] myArray) {
        int numNegativeSubarrays = 0;

        for (int i = 0; i < myArray.length; i++) {
            for (int j = i; j < myArray.length; j++) {

                int sum = 0;

                for (int k = i; k <= j; k++) {
                    sum = sum + myArray[k];
                }

                if (sum < 0) {
                    numNegativeSubarrays++;
                }
            }
        }
        return numNegativeSubarrays;
    }

    /**
     * Given an array of integers A sorted in non-decreasing order,
     * return an array of the squares of each number, also in sorted non-decreasing order.
     *
     * @param nums
     * @return sortedArray
     */
    public int[] squredSortedArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(Math.abs(nums[i]), 2);
        }
        Arrays.sort(nums);
        return nums;
    }

    /**
     * Given a fixed length array nums of integers, duplicate each occurrence of zero,
     * shifting the remaining elements to the right.
     *
     * @param nums
     * @return
     */
    public int[] duplicateZeros(int[] nums) {

        for (int idxOut = 0; idxOut < nums.length; idxOut++) {
            if (nums[idxOut] == 0) {
                for (int idxIn = nums.length - 1; idxIn > idxOut + 1; idxIn--) {
                    nums[idxIn] = nums[idxIn - 1];
                }
                if (idxOut < nums.length - 1) {
                    nums[idxOut + 1] = 0;
                    idxOut++;
                }
            }
        }
        return nums;
    }

    /**
     * Sorted array is returned by merging given two arrays
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] mergeSort(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];

        int i1 = 0, i2 = 0, k = 0;
        for (; i1 < nums1.length && i2 < nums2.length; k++) {
            if (nums1[i1] < nums2[i2]) {
                result[k] = nums1[i1];
                i1++;
            } else {
                result[k] = nums2[i2];
                i2++;
            }
        }

        if (i1 < nums1.length) {
            for (; i1 < nums1.length; i1++, k++) {
                result[k] = nums1[i1];
            }
        }

        if (i2 < nums2.length) {
            for (; i2 < nums2.length; i2++, k++) {
                result[k] = nums2[i2];
            }
        }
        return result;
    }
}
