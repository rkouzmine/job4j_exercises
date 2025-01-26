package ru.job4j.loop;

public class Task150 {
    public static void loop(int overdraft, int account, int[] transfers) {
        int count = 0;
        for (int num : transfers) {
            if (num == 0) {
                break;
            }
            if (account + num >= overdraft) {
                account += num;
                count++;
            } else {
                break;
            }
        }
        System.out.printf("Остаток: %d, операций: %d%n", account, count);
    }

    public static void main(String[] args) {
        loop(-100, 500, new int[]{-400, 200, 100, -1000});
        loop(-100, 500, new int[]{-400, 200, 0, 300});
        loop(-100, 500, new int[]{-500, -100, 0, 300});
    }
}
