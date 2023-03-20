package org.example;

import java.util.Arrays;

public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        int[] count = countLetters(a);
        int[] count2 = countLetters(b);
        String string1 = Arrays.toString(count);
        String string2 = Arrays.toString(count2);
        return string1.equals(string2);
    }
    static boolean isAnagram2(String a, String b) {
        char[] chars1=a.toLowerCase().toCharArray();
        char[] chars2=b.toLowerCase().toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1,chars2);
    }

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

        count[18] = line.length()
                - line.replace("r", "")
                .replace("R", "").length();
        count[19] = line.length()
                - line.replace("s", "")
                .replace("S", "").length();
        count[20] = line.length()
                - line.replace("t", "")
                .replace("T", "").length();
        count[21] = line.length()
                - line.replace("u", "")
                .replace("U", "").length();
        count[22] = line.length()
                - line.replace("v", "")
                .replace("V", "").length();
        count[23] = line.length()
                - line.replace("w", "")
                .replace("W", "").length();
        count[24] = line.length()
                - line.replace("x", "")
                .replace("X", "").length();
        count[25] = line.length()
                - line.replace("y", "")
                .replace("Y", "").length();
        count[17] = line.length()
                - line.replace("z", "")
                .replace("Z", "").length();

        return count;
    }

    public static void main(String[] args) {


        String a = "anagramaa";
        String b = "margana";

        boolean ret = isAnagram2(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");


    }
}
