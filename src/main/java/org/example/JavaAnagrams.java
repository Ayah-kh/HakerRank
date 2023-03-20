package org.example;

import java.util.Arrays;

public class JavaAnagrams {
//    static boolean isAnagram(String a, String b) {
//        // Complete the function
//    }

    static int[] countLetters(String line) {
        int[] count = new int[26];

        count[0] = line.length()
                - line.replace("a", "")
                .replace("A", "").length();
        count[1] = line.length()
                - line.replace("b", "")
                .replace("B", "").length();
        count[2] = line.length()
                - line.replace("c", "")
                .replace("C", "").length();
        count[3] = line.length()
                - line.replace("d", "")
                .replace("D", "").length();
        count[4] = line.length()
                - line.replace("e", "")
                .replace("E", "").length();
        count[5] = line.length()
                - line.replace("f", "")
                .replace("F", "").length();
        count[6] = line.length()
                - line.replace("g", "")
                .replace("G", "").length();
        count[7] = line.length()
                - line.replace("h", "")
                .replace("H", "").length();
        count[8] = line.length()
                - line.replace("i", "")
                .replace("I", "").length();
        count[9] = line.length()
                - line.replace("j", "")
                .replace("J", "").length();
        count[10] = line.length()
                - line.replace("k", "")
                .replace("K", "").length();
        count[11] = line.length()
                - line.replace("l", "")
                .replace("L", "").length();
        count[12] = line.length()
                - line.replace("m", "")
                .replace("M", "").length();
        count[13] = line.length()
                - line.replace("n", "")
                .replace("N", "").length();

        count[14] = line.length()
                - line.replace("o", "")
                .replace("O", "").length();
        count[15] = line.length()
                - line.replace("p", "")
                .replace("P", "").length();
        count[16] = line.length()
                - line.replace("q", "")
                .replace("Q", "").length();

        return count;
    }

    public static void main(String[] args) {


//        String a = "anagramm";
//        String b = "marganaa";
//
//        boolean ret = isAnagram(a, b);
//        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

        int[] count= countLetters("Elephant");
        int[] count2= countLetters("tlepHanE");
        System.out.println(Arrays.toString(count));
        System.out.println(Arrays.toString(count2));



    }
}
