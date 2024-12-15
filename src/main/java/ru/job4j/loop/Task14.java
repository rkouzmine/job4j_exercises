package ru.job4j.loop;

import java.util.StringJoiner;

public class Task14 {
    public static void loop(int a, int b) {
        String ln = System.lineSeparator();
        StringJoiner stringJoiner = new StringJoiner(" ", "Старт" + ln, "\nФиниш" + ln);
        for (int i = a; i < b; i++) {
            if (i >= 10) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.print(stringJoiner);
    }

    public static void main(String[] args) {
        loop(26, 29);
    }
}