package ru.job4j.loop;

import java.util.StringJoiner;

public class Task89 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        int count = 0;
        for (int i = 100; i < 999; i++) {
            int a = i / 100;
            int b = i / 10 % 10;
            int c = i % 10;

            int rsl = a * a * a + b * b * b + c * c * c;
            if (i == rsl) {
                count++;
                sj.add(String.valueOf(i));
            }
        }
        System.out.printf("Числа: %s, Количество: %d%n", sj, count);
    }
}