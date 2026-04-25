package ru.job4j.loop;

public class Hamming {
    public static int checkStrings(String left, String right) {
        int count = 0;
        if (left.length() == right.length()) {
            for (int i = 0; i < left.length(); i++) {
                char chLeft = left.charAt(i);
                char chRight = right.charAt(i);
                if (chRight != chLeft) {
                    count++;
                }
            }
        } else {
            count = -1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(checkStrings("2173896", "2233796"));
        System.out.println(checkStrings("abcde", "bcdef"));
        System.out.println(checkStrings("abcde", "bcde"));
    }
}