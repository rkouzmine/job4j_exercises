package ru.job4j.condition;

public class Task66 {
    public static void daytime(int number) {
        String result = "Не является часом";
        switch (number) {
            case 6, 7, 8, 9, 10 -> result = "Утро";
            case 11, 12, 13, 14, 15, 16, 17 -> result = "День";
            case 18, 19, 20, 21, 22 -> result = "Вечер";
            case 23, 0, 1, 2, 3, 4, 5 -> result = "Ночь";
            default -> result = "Не является часом";
        }
        System.out.println(result);
    }
}