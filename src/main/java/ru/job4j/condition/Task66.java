package ru.job4j.condition;

public class Task66 {
    public static void daytime(int number) {
        String result = "Не является часом";
        if (number >= 0 && number <= 23) {
            if (number >= 6 && number <= 10) {
                result = "Утро";
            } else if (number >= 11 && number <= 17) {
                result = "День";
            } else if (number >= 18 && number <= 22) {
                result = "Вечер";
            } else {
                result = "Ночь";
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        daytime(15);
        daytime(23);
        daytime(24);
        daytime(0);
    }
}