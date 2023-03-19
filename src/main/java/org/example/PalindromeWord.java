package org.example;


import java.util.Arrays;

public class PalindromeWord {

//    A palindrome is a word, phrase, number,
//    or other sequence of characters which reads
//    the same backward or forward.

    public static void main(String[] args) {


        String A = "madffdam";
        char[] words = A.toCharArray();
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);
        boolean isPalindrome = true;

        for (int i = 0; i < words.length / 2; i++) {
            if (!isPalindrome)
                break;

            if (words[i] == words[words.length - 1 - i])
                isPalindrome = true;
            else {
                isPalindrome = false;

            }

        }

        if (isPalindrome)
            System.out.println("Yes");
        else
            System.out.println("No");


    }
}


