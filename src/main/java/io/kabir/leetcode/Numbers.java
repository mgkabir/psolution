package io.kabir.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Numbers {
    public int reverse(int num) {

        int result = 0;

        while (num != 0) {
            int lsd = num % 10;

            if (result > Integer.MAX_VALUE / 10) return 0;
            if (result < Integer.MIN_VALUE / 10) return 0;

            result = result * 10 + lsd;
            num = num / 10;
        }

        return result;
    }

    public int romanToInt(String romanStr) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        // MCMXCIV
        int result = romanMap.get(romanStr.charAt(romanStr.length() - 1));

        for (int i = romanStr.length() - 2; i >= 0; --i) {
            if (romanMap.get(romanStr.charAt(i)) < romanMap.get(romanStr.charAt(i + 1))) {
                result = result - romanMap.get(romanStr.charAt(i));
            } else {
                result = result + romanMap.get(romanStr.charAt(i));
            }
        }

        return result;
    }
}
