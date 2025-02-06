package ru.job4j.loop;

import java.util.StringJoiner;

public class Task164 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 10; i <= 20; i++) {
            if (Math.pow(i, 2) <= 300) {
                sj.add(String.valueOf(i));
            }
        }
        System.out.println(sj.toString());
    }

    public static void main(String[] args) {
        loop();
    }
}
