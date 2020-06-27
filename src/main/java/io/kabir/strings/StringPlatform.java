package io.kabir.strings;

public class StringPlatform {
    public String getSubString(String str, int startIdx, int endIdx) {
        if (str.isEmpty() || startIdx >= endIdx) throw new IllegalArgumentException("Invalid data");
        return str.substring(startIdx, endIdx);
    }


    /*checks if the given input is Palindrome */
    public boolean isPalindrome(String inputStr) {
        if (inputStr == null || inputStr.isEmpty()) throw new IllegalArgumentException("Bad Argument");
        inputStr = inputStr.toLowerCase();
        int strLength = inputStr.length();
        if (strLength == 1) return true;

        int midPoint = (strLength / 2) + 1;
        for (int pos = 0; pos < midPoint; pos++) {
            if (inputStr.charAt(pos) != inputStr.charAt(strLength - pos - 1)) return false;
        }
        return true;

    }
}