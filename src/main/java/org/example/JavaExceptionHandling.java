package org.example;

import java.util.*;

class MyCalculator {
    public long power (int n, int p) throws Exception {
        long result;
//        if (n==0 && p==0)
//            throw new Exception("java.lang.Exception: n and p should not be zero.");

        result = (long) Math.pow(n, p);
        return result;
    }
    /*
     * Create the method long power(int, int) here.
     */

}

public class JavaExceptionHandling {

    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int n = 2;
        int p = 3;

        try {
            System.out.println(my_calculator.power(n, p));
        } catch (Exception e) {
            System.out.println(e);

        }
    }
}