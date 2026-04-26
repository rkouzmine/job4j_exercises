package ru.job4j.loop;

public class Task78 {
    public static void loop(int[] days, int[] values) {
        if (days == null || values == null) {
            throw new IllegalArgumentException("Массивы не могут быть null");
        }

        if (days.length != values.length) {
            throw new IllegalArgumentException(
                    "Массивы должны иметь одинаковую длину: " + days.length + " != " + values.length
            );
        }

        int x = 0;
        int y = 0;

        for (int i = 0; i < days.length; i++) {
            if (days[i] < 1 || days[i] > 7) {
                throw new IllegalArgumentException("День недели должен быть от 1 до 7: " + days[i]);
            }
            if (values[i] < 1 || values[i] > 10) {
                throw new IllegalArgumentException("Значение загрязнения должно быть от 1 до 10: " + values[i]);
            }

            if (days[i] == 2 && values[i] <= 5) {
                y++;
            }
            if (values[i] >= 7) {
                x++;
            }
        }
        System.out.printf("Опасно: %d, спокойный вторник: %d%n", x, y);
    }

    public static void main(String[] args) {
        int[] days = {1, 2, 3, 4};
        int[] values = {1, 5, 7, 9};
        loop(days, values);
    }
}