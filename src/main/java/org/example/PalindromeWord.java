package org.example;


import java.util.Arrays;

public class PalindromeWord {

//    A palindrome is a word, phrase, number,
//    or other sequence of characters which reads
//    the same backward or forward.

    public static void main(String[] args) {


        String word = "madfffam";
        char[] words = word.toCharArray();
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);
        boolean isPalindrome = false;

        for (int i = 0; i < words.length / 2; i++) {
            if (words[i] == words[words.length - 1 - i])
                isPalindrome = true;
            else {
                isPalindrome = false;

            }

            System.out.println("i: " + i + ">>" + words[i] +
                    " - " + "Array length-1 : " + words[words.length - 1 - i]);
            System.out.println(isPalindrome);
        }


    }
}


