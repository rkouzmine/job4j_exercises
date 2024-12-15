package ru.job4j.array;

public class SumOfDifferences {
    public static int sum(int[] nums) {
        return nums[0] - nums[nums.length - 1];
    }
}