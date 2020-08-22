package io.kabir.thread;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Playground {

    public static void main(String[] args) {


        Integer num1 = 200;
        Integer num2 = 200;
        if (num1 == num2) {
            System.out.println("num1 == num2");
        } else {
            System.out.println("num1 != num2");
        }

        System.out.println(1.0/0.0);
    }

}
