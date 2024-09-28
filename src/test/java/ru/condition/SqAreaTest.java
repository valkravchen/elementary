package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SqAreaTest {

    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenP10K4Square4() {
        int expected = 4;
        int p = 10;
        double k = 4;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenP24K3Square27() {
        int expected = 27;
        int p = 24;
        double k = 3;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected);
    }
}