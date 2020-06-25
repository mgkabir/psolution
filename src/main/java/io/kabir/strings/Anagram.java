package io.kabir.strings;

import java.util.Map;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class Anagram {
    public boolean isAnagram(String firstStr, String secondStr)throws IllegalArgumentException{
        if(firstStr == null || firstStr.length() ==0 || secondStr == null || secondStr.length() ==0){
            throw new IllegalArgumentException("Bad Argument");
        }
        if(firstStr.length() != secondStr.length()) return false;

        boolean isAnagram;

        Map<Character, Integer> aMap = new TreeMap<>();
        Map<Character, Integer> bMap = new TreeMap<>();

        putIntoMap(aMap, firstStr);
        putIntoMap(bMap, secondStr);
        isAnagram = aMap.equals(bMap);

        return isAnagram;
    }

    private static void putIntoMap(Map<Character, Integer> charMap, String str) {
        Stream<Character> charStream = str.chars().mapToObj(value -> (char) value);
        charStream.forEach(character -> {
            if(charMap.containsKey(character)){
                Integer count = charMap.get(character);
                charMap.replace(character,++count);
            }else {
                charMap.put(character,1);
            }
        });
    }


    void delaySecond(int second) {
        try {
            TimeUnit.SECONDS.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
