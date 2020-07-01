package io.kabir.maths;

public class MathUtils {

    public int add(int a, int b){
        return a+b;
    }

    public int gcd(int[] numbers){
        return getGCD(numbers[0],numbers[1]);
    }

    private int getGCD(int num1, int num2){
        if(num2 == 0) return num1;

        return getGCD(num2, num1 % num2);
    }
}
