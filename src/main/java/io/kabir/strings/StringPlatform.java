package io.kabir.strings;

public class StringPlatform {
    public String getSubString(String str, int startIdx, int endIdx) {
        if(str.isEmpty() || startIdx >= endIdx) throw new IllegalArgumentException("Invalid data");
        return str.substring(startIdx,endIdx);
    }
}
