package ru.job4j.loop;

import java.util.StringJoiner;

public class Task123 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");
        /**
         * Продолжаем, пока число не станет однозначным
         */
        while (num >= 10) {
            num = sumDigit(num);
            sj.add(String.valueOf(num));
        }
        System.out.println(sj);
    }

    private static int sumDigit(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        loop(545);
        loop(6);
    }
}
