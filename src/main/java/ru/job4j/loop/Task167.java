package ru.job4j.loop;

import java.util.StringJoiner;

public class Task167 {
    private static double avgArray(int[] array) {
        StringJoiner sj = new StringJoiner(" ");
        double sum = 0;

        for (int grades : array) {
            sum += grades;
            sj.add(String.valueOf(grades));
        }
        double avg = sum / array.length;
        System.out.printf("Оценки: %s, средняя: %s%n", sj.toString(), avg);
        return avg;
    }

    public static void loop(int[] first, int[] second, int[] third) {
        double maxAvg = 0;
        int count = 0;
        double avgFirst = avgArray(first);
        if (avgFirst > 4.5) {
            count++;
        }
        maxAvg = Math.max(maxAvg, avgFirst);

        double avgSecond = avgArray(second);
        if (avgSecond > 4.5) {
            count++;
        }
        maxAvg = Math.max(maxAvg, avgSecond);

        double avgThird = avgArray(third);
        if (avgThird > 4.5) {
            count++;
        }
        maxAvg = Math.max(maxAvg, avgThird);

        System.out.printf("Выше 4.5: %d, наивысшая: %s%n", count, maxAvg);
    }

    public static void main(String[] args) {
        loop(new int[]{5, 4, 3, 5, 5}, new int[]{2, 4, 3, 5, 4}, new int[]{5, 5, 5, 4, 5});
    }
}