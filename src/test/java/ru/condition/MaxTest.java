package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int firstNumber = 1;
        int secondNumber = 2;
        int result = Max.max(firstNumber, secondNumber);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To2Then3() {
        int firstNumber = 3;
        int secondNumber = 2;
        int result = Max.max(firstNumber, secondNumber);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To3Then3() {
        int firstNumber = 3;
        int secondNumber = 3;
        int result = Max.max(firstNumber, secondNumber);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To3Then3() {
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 3;
        int result = Max.max(firstNumber, secondNumber, thirdNumber);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To3To2Then3() {
        int firstNumber = 1;
        int secondNumber = 3;
        int thirdNumber = 2;
        int result = Max.max(firstNumber, secondNumber, thirdNumber);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To1To2Then3() {
        int firstNumber = 3;
        int secondNumber = 1;
        int thirdNumber = 2;
        int result = Max.max(firstNumber, secondNumber, thirdNumber);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To3To3Then3() {
        int firstNumber = 3;
        int secondNumber = 3;
        int thirdNumber = 3;
        int result = Max.max(firstNumber, secondNumber, thirdNumber);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To3To4Then4() {
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 3;
        int fourthNumber = 4;
        int result = Max.max(firstNumber, secondNumber, thirdNumber, fourthNumber);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To4To3Then4() {
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 4;
        int fourthNumber = 3;
        int result = Max.max(firstNumber, secondNumber, thirdNumber, fourthNumber);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To4To3To2Then4() {
        int firstNumber = 1;
        int secondNumber = 4;
        int thirdNumber = 3;
        int fourthNumber = 2;
        int result = Max.max(firstNumber, secondNumber, thirdNumber, fourthNumber);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4To2To3To1Then4() {
        int firstNumber = 4;
        int secondNumber = 2;
        int thirdNumber = 3;
        int fourthNumber = 1;
        int result = Max.max(firstNumber, secondNumber, thirdNumber, fourthNumber);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4To4To4To4Then4() {
        int firstNumber = 4;
        int secondNumber = 4;
        int thirdNumber = 4;
        int fourthNumber = 4;
        int result = Max.max(firstNumber, secondNumber, thirdNumber, fourthNumber);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }
}