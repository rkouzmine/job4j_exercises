package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        boolean rsl = true;
        String str = String.valueOf(i);
        for (int j = 0; j < str.length() / 2; j++) {
            if (str.charAt(j) != str.charAt(str.length() - 1 - j)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(check(12321));
        System.out.println(check(1112111));
        System.out.println(check(123456321));
    }
}