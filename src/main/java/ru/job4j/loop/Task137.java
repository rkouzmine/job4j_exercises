package ru.job4j.loop;

public class Task137 {
    public static void loop(int num) {
        for (int i = 10; i < 100; i++) {
            int digFirst = i % 10;
            int digSecond = i / 10;
            if (digFirst + digSecond == num) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        loop(9);
        loop(3);
        loop(16);
    }
}
