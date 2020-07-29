package io.kabir.arrays;

import java.util.*;
import java.util.stream.Collectors;

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
     *
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

    public String longestCommonPrefix(String[] strs) {
        if (strs == null) throw new IllegalArgumentException("Should not be Null");
        if (strs.length == 1) return strs[0];
        if (strs.length == 0) return "";
        StringBuilder cPrefix = new StringBuilder();
        int minLength = strs[0].trim().length();
        for (String str : strs) {
            if (str.trim().isEmpty()) return "";
            int strLen = str.trim().length();
            minLength = (strLen < minLength) ? strLen : minLength;
        }

        for (int idx = 0; idx < minLength; idx++) {
            int i;
            for (i = 0; i < strs.length - 1; i++) {
                if (strs[i].charAt(idx) != strs[i + 1].charAt(idx)) return cPrefix.toString();
            }
            cPrefix.append(strs[i].charAt(idx));
        }

        return cPrefix.toString();
    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numFreqMap = new HashMap<>();
        for (int num : nums) {
            numFreqMap.put(num, numFreqMap.getOrDefault(num, 0) + 1);
        }
        List<Integer> r = new ArrayList<>();

        numFreqMap
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .limit(k)
                .collect(Collectors.toList()).forEach(e -> {
            r.add(e.getValue());
        });

        int[] result = new int[k];
        int idx = 0;

        Iterator<Integer> iterator = r.iterator();
        while (iterator.hasNext()) {
            result[idx++] = iterator.next();
        }
        return result;
    }

    public int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (!isExist(nums, i)) return i;
        }
        return 0;
    }

    private boolean isExist(int[] nums, int element) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element) return true;
        }
        return false;
    }
}







