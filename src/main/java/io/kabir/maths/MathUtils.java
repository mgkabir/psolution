package io.kabir.maths;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MathUtils {

    public int add(int a, int b) {
        return a + b;
    }

    public int gcd(int[] numbers) {
        int gcd = 0;
        if (numbers.length < 2) throw new IllegalArgumentException("At least 2 numbers required");
        boolean containsZero = IntStream.of(numbers).anyMatch(n -> n == 0);
        if (containsZero) throw new IllegalArgumentException("Non Zero Value");
        if (numbers.length == 2) {
            gcd = getGCD(numbers[0], numbers[1]);
        } else {
            int num1 = numbers[0];
            int num2 = numbers[1];
            gcd = getGCD(num1, num2);
            for (int idx = 2; idx < numbers.length; idx++) {
                num1 = gcd;
                num2 = numbers[idx];
                gcd = getGCD(num1, num2);
            }
        }
        return gcd;
    }

    private int getGCD(int num1, int num2) {
        System.out.println("num1 : " + num1 + " num2 : " + num2);
        if (num2 == 0) {
            System.out.println(" == returning == " + num1);
            return num1;
        }
        return getGCD(num2, num1 % num2);
    }

    public int[] twoSum(int[] nums, int target){
        int[] result = new int[2];

        for (int idxOut = 0; idxOut < nums.length; idxOut++) {
            for (int idxIn = idxOut + 1; idxIn < nums.length; idxIn++) {
                if(nums[idxOut] + nums[idxIn] == target){
                    result[0] = idxOut;
                    result[1] = idxIn;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
