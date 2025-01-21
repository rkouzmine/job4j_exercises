package ru.job4j.loop;

import java.util.StringJoiner;

public class Abbreviation {
    public static String collect(String s) {
        StringJoiner sj = new StringJoiner("");
        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {

                sj.add(String.valueOf(ch));
            }
        }
        return sj.toString();
    }

    public static void main(String[] args) {
        String rsl = "United Nations Organization";
        System.out.println(collect(rsl));
    }
}