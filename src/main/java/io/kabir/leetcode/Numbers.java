package io.kabir.leetcode;

public class Numbers {
    public int reverse(int num) {

        int result = 0;

        while (num != 0) {
            int msd = num % 10;

            if (result > Integer.MAX_VALUE / 10) return 0;
            if (result < Integer.MIN_VALUE / 10) return 0;

            result = result * 10 + msd;
            num = num / 10;
        }

        return result;
    }
}
