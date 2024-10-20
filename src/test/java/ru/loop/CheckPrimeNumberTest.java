package ru.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CheckPrimeNumberTest {

    @Test
    void when5() {
        int number = 5;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isTrue();
    }

    @Test
    void when4() {
        int number = 4;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    @Test
    void when1() {
        int number = 1;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    @Test
    void when0() {
        int number = 0;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    @Test
    void when11() {
        int number = 11;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isTrue();
    }

    @Test
    void when33() {
        int number = 33;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }
}