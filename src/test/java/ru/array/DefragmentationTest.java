package ru.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class DefragmentationTest {

    @Test
    void whenOneFirst0() {
        int[] array = {0, 1};
        int[] result = Defragmentation.compress(array);
        int[] expected = {1, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenEmptyArray() {
        int[] array = {};
        int[] result = Defragmentation.compress(array);
        int[] expected = {};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNotFirst0() {
        int[] array = {1, 0, 2, 0, 3, 0, 4};
        int[] result = Defragmentation.compress(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFirst0() {
        int[] array = {0, 1, 2, 0, 3, 0, 4};
        int[] result = Defragmentation.compress(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFirst0AndLast0() {
        int[] array = {0, 1, 2, 0, 3, 0, 4, 0, 0, 0};
        int[] result = Defragmentation.compress(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenAll0() {
        int[] array = {0, 0, 0, 0};
        int[] result = Defragmentation.compress(array);
        int[] expected = {0, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSomeNumber0() {
        int[] array = {0, 0, 0, 1, 2, 3, 4};
        int[] result = Defragmentation.compress(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNotContains0() {
        int[] array = {1, 2, 3, 4};
        int[] result = Defragmentation.compress(array);
        int[] expected = {1, 2, 3, 4};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when2PointOneFirst0() {
        int[] array = {0, 1};
        int[] result = Defragmentation.compress2Point(array);
        int[] expected = {1, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when2PointEmptyArray() {
        int[] array = {};
        int[] result = Defragmentation.compress2Point(array);
        int[] expected = {};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when2PointNotFirst0() {
        int[] array = {1, 0, 2, 0, 3, 0, 4};
        int[] result = Defragmentation.compress2Point(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when2PointFirst0() {
        int[] array = {0, 1, 2, 0, 3, 0, 4};
        int[] result = Defragmentation.compress2Point(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when2PointFirst0AndLast0() {
        int[] array = {0, 1, 2, 0, 3, 0, 4, 0, 0, 0};
        int[] result = Defragmentation.compress2Point(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when2PointAll0() {
        int[] array = {0, 0, 0, 0};
        int[] result = Defragmentation.compress2Point(array);
        int[] expected = {0, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when2PointSomeNumber0() {
        int[] array = {0, 0, 0, 1, 2, 3, 4};
        int[] result = Defragmentation.compress2Point(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when2PointNotContains0() {
        int[] array = {1, 2, 3, 4};
        int[] result = Defragmentation.compress2Point(array);
        int[] expected = {1, 2, 3, 4};
        assertThat(result).isEqualTo(expected);
    }
}