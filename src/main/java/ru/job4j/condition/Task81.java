package ru.job4j.condition;

public class Task81 {
    public static void isLatin(char s) {
        if (String.valueOf(s).matches("[\\u0000-\\u007F]")) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        isLatin('s');
        isLatin('й');
        isLatin('1');
    }
}