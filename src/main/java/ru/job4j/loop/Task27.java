package ru.job4j.loop;

import java.util.StringJoiner;

public class Task27 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = -num + 1; i < num; i++) {
            stringJoiner.add(String.valueOf(i));
        }
        System.out.println(stringJoiner);
    }

    public static void main(String[] args) {
        loop(1);
        loop(2);
        loop(3);
    }
}
