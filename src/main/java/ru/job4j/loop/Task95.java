package ru.job4j.loop;

public class Task95 {
    public static void loop(int[] math, int[] info) {
        int count = 0;
        int mathClass = 0;
        int infoClass = 0;
        for (int i = 0; i < 5; i++) {
            if ((math[i] + info[i]) / 2 >= 7) {
                count++;
                if (math[i] > info[i]) {
                    mathClass++;
                } else {
                    infoClass++;
                }
            }
        }
        System.out.printf("Зачислено: %d, ФМ: %d, ФИ: %d%n", count, mathClass, infoClass);
    }

    public static void main(String[] args) {
        loop(new int[]{7, 9, 6, 2, 4}, new int[]{7, 8, 9, 5, 6});
    }
}