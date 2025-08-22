package ru.job4j.condition;

public class Task66 {
    public static void daytime(int number) {
        String result = switch (number) {
            case 6, 7, 8, 9, 10 -> "Утро";
            case 11, 12, 13, 14, 15, 16, 17 -> "День";
            case 18, 19, 20, 21, 22 -> "Вечер";
            case 23, 0, 1, 2, 3, 4, 5 -> "Ночь";
            default -> "Не является часом";
        };
        System.out.println(result);
    }

    public static void main(String[] args) {
        daytime(10);
        daytime(15);
        daytime(20);
        daytime(23);
        daytime(0);
        daytime(24);
    }
}