package ru.job4j.loop;

import java.util.StringJoiner;

public class Task125 {
    public static void loop(int num) {
        StringJoiner sjEven = new StringJoiner(" ");
        StringJoiner sjNotEven = new StringJoiner(" ");
        String sumSize = String.valueOf(num);

        for (int i = 0; i < sumSize.length(); i++) {
            int digit = sumSize.charAt(i) - '0';
            if (digit % 2 == 0) {
                sjEven.add(String.valueOf(digit));
            } else {
                sjNotEven.add(String.valueOf(digit));
            }
        }

        int first = sjEven.length();
        int second = sjNotEven.length();
        if (first != 0 && second != 0) {
            System.out.println(sjEven);
            System.out.println(sjNotEven);
        } else if (first != 0) {
            System.out.println(sjEven);
        } else if (second != 0) {
            System.out.println(sjNotEven);
        }
    }

    public static void main(String[] args) {
        loop(12345);
        System.out.println();
        loop(20);
        System.out.println();
        loop(548506);
        System.out.println();
        loop(32133);
        System.out.println();
        loop(11);
        System.out.println();
    }
}
