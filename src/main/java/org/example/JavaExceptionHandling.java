package org.example;

import java.util.*;

class MyCalculator {
    public long power(int n, int p) throws Exception {
        if (n == 0 && p == 0)
            throw new Exception("java.lang.Exception: n and p should not be zero.");
        if (n < 0 || p < 0)
            throw new Exception("java.lang.Exception: n or p should not be negative.");

        return (long) Math.pow(n, p);
    }
    /*
     * Create the method long power(int, int) here.
     */

}

public class JavaExceptionHandling {

    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int n = 0;
        int p = 0;

        try {
            System.out.println(my_calculator.power(n, p));
        } catch (Exception e) {
            System.out.println(e);

        }
    }
}