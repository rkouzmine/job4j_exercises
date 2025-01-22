package ru.job4j.loop;

public class Task146 {
    public static void loop(int[] nums) {
        final int MAX_WEIGHT = 300;
        final int MAX_NUM_OF_PEOPLE = 4;

        int currentWeight = 0;
        int totalWeight = 0;
        int count = 0;

        for (int num : nums) {
            totalWeight += num;
            if (currentWeight + num <= MAX_WEIGHT && count < MAX_NUM_OF_PEOPLE) {
                currentWeight += num;
                count++;
            }
        }

        if (totalWeight > MAX_WEIGHT && nums.length > MAX_NUM_OF_PEOPLE) {
            System.out.printf("Людей: %d, вес: %d, отказ: %s%n", count, currentWeight, "Много людей и перегруз");
        } else if (totalWeight > MAX_WEIGHT) {
            System.out.printf("Людей: %d, вес: %d, отказ: %s%n", count, currentWeight, "Перегруз");
        } else if (nums.length > MAX_NUM_OF_PEOPLE) {
            System.out.printf("Людей: %d, вес: %d, отказ: %s%n", count, currentWeight, "Много людей");
        } else {
            System.out.printf("Людей: %d, вес: %d, отказ: %s%n", count, currentWeight, "Нет");
        }
    }

    public static void main(String[] args) {
        loop(new int[]{60, 80, 80, 70, 65});
        loop(new int[]{60, 80, 80});
        loop(new int[]{60, 80, 80, 80});
        loop(new int[]{60, 55, 60, 55, 65});
    }
}