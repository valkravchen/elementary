package vaok.tasks.array;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.*;

class FindLoopRangeTest {

    @Test
    void whenElementNotInRangeThenMinus1() {
        int[] data = new int[]{5, 3};
        int element = 10;
        int start = 0;
        int end = 1;
        int result = FindLoopRange.lastIndexOf(data, element, start, end);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}