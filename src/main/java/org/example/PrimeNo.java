package org.example;

import java.math.BigInteger;

public class PrimeNo {
    public static void main(String[] args) {

        BigInteger bigInteger=new BigInteger("22");
         if (bigInteger.isProbablePrime(1))
             System.out.println("prime");
         else
             System.out.println("not prime");

    }

}