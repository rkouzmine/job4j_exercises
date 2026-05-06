package ru.job4j.array;

public class Fibonacci {
    public static boolean checkArray(int[] data) {
        if (data.length < 3) {
            throw new IllegalArgumentException("Массив должен иметь минимум 3 числа");
        }
        boolean rsl = true;
        for (int i = 2; i < data.length; i++) {
            if (data[i - 2] + data[i - 1] != data[i]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        int[] arr2 = new int[]{0, 1, 1, 2, 3, 5, 8, 13};
        int[] arr3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr4 = new int[]{1, 2, 3};
        int[] arr5 = new int[]{1, 2};
        System.out.println(checkArray(arr1));
        System.out.println(checkArray(arr2));
        System.out.println(checkArray(arr3));
        System.out.println(checkArray(arr4));
        System.out.println(checkArray(arr5));
    }
}