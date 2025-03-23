package ru.job4j.condition;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        String result = "none";
        if (left + right == rsl) {
            result = "added";
        } else if (left - right == rsl) {
            result = "subtracted";
        } else if (left * right == rsl) {
            result = "multiplied";
        } else if (left / right == rsl) {
            result = "divided";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(selectAction(2, 2, 4));
        System.out.println(selectAction(2, 2, 0));
        System.out.println(selectAction(3, 5, 15));
        System.out.println(selectAction(15, 5, 3));
    }
}