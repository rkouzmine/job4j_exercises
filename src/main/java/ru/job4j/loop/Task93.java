package ru.job4j.loop;

public class Task93 {
    public static void loop(int[] first, int[] second) {
        int point = 0;
        int sum = 0;
        int count = 0;
        while (point < first.length && first[point] + second[point] >= 80) {
            sum += first[point] + second[point];
            count++;
            point++;
        }
        System.out.printf("В финале: %d, сумма баллов: %d%n", count, sum);
    }

    public static void main(String[] args) {
        loop(new int[]{30, 40, 45}, new int[]{50, 45, 20});
        loop(new int[]{50, 40, 45}, new int[]{50, 45, 40});
    }
}