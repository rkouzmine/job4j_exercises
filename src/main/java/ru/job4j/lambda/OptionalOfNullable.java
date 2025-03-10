package ru.job4j.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalOfNullable {
    public static Optional<String> findValue(List<String> strings, String value) {
        return strings.contains(value) ? Optional.ofNullable(value) : Optional.empty();
    }

    public static void main(String[] args) {
        System.out.println(findValue(Arrays.asList("a", "b", "c"), "c"));
        System.out.println(findValue(Arrays.asList("a", "b", null), null));
    }
}