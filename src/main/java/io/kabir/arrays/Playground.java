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
}
