package ru.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {
    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromThreeToThirtyThreeThenTwoHundredAndSeventy() {
        int start = 3;
        int finish = 33;
        int result = Counter.sumByEven(start, finish);
        int expected = 270;
        assertThat(result).isEqualTo(expected);
    }
}