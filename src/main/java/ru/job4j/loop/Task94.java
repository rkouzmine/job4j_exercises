package ru.job4j.loop;

import java.util.StringJoiner;

public class Task94 {
    public static void loop(int[] diameter, int[] weight) {
        if (diameter == null || weight == null) {
            throw new IllegalArgumentException("Массивы не могут быть null");
        }

        if (diameter.length != weight.length) {
            throw new IllegalArgumentException(
                    "Массивы должны иметь одинаковую длину: " + diameter.length + " != " + weight.length
            );
        }
        StringJoiner sj = new StringJoiner(", ");
        for (int i = 0; i < diameter.length; i++) {
            if (diameter[i] >= 22 && diameter[i] <= 26 && weight[i] >= 71 && weight[i] <= 77) {
                sj.add("Да");
            } else {
                sj.add("Нет");
            }
        }
        System.out.println(sj);
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{24, 22, 26, 26, 27};
        int[] arr2 = new int[]{77, 74, 78, 71, 74};

        loop(arr1, arr2);
    }
}