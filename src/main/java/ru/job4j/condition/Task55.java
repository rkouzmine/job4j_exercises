package ru.job4j.condition;

public class Task55 {
    public static void apartmentPlace(int number) {
        int floor = (int) Math.ceil(number / 3.0);
        int position = number % 3 == 0 ? 3 : number % 3;
        System.out.println(floor);
        System.out.println(position);
    }

    public static void main(String[] args) {
        apartmentPlace(12);
        apartmentPlace(11);
        apartmentPlace(7);
        apartmentPlace(3);
    }
}