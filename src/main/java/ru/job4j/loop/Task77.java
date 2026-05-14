package ru.job4j.loop;

public class Task77 {
    public static void loop(int num1, int num2) {
        int sum = 0;
        int minNum = Math.min(num1, num2);
        for (int i = 1; i <= minNum; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        loop(12, 24);
        loop(6, 10);
        loop(4, 8);
        loop(14, 28);
    }
}