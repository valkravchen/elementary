package ru.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CheckTest {
    @Test
    void whenDataMonoTrueThenTrue() {
        boolean[] data = {true, true, true};
        boolean result = Check.mono(data);
        assertThat(result).isTrue();
    }

    @Test
    void whenDataNotMonoThenFalse() {
        boolean[] data = {true, false, true};
        boolean result = Check.mono(data);
        assertThat(result).isFalse();
    }

    @Test
    void whenDataMonoFalseThenTrue() {
        boolean[] data = {false, false, false};
        boolean result = Check.mono(data);
        assertThat(result).isTrue();
    }
}