package ru.job4j.loop;

public class Task149 {
    public static void loop(int[] grades) {
        double avg = 0.0;
        int count = 0;
        for (int num : grades) {
            if (num >= 1 && num <= 5) {
                avg += num;
                count++;
            } else {
                break;
            }
        }
        String result = String.format("%.2f", avg / count);
        System.out.println(result);
    }

    public static void main(String[] args) {
        loop(new int[]{2, 5, 3, 5, 6, 3, 4});
        loop(new int[]{2, 2, 1, 5, 2, 8, 4});
    }
}
