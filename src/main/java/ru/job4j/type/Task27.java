package ru.job4j.type;

public class Task27 {
    public static void transform(int number) {
        int num1, num2, num3;
        num1 = number % 10;
        number /= 10;
        num2 = number % 10;
        num3 = number / 10;
        System.out.println((num1 * 100 + num2 * 10 + num3) - 20);
    }
}