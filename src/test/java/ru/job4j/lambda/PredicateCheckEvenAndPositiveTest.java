package ru.job4j.lambda;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PredicateCheckEvenAndPositiveTest {

    @Test
    public void test() {
        assertThat(PredicateCheckEvenAndPositive.check(2));
        assertThat(PredicateCheckEvenAndPositive.check(-2));
        assertThat(PredicateCheckEvenAndPositive.check(1));
    }
}