package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSortThreeNumbers() {
        int[] data = new int[]{44, 33, 55};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{33, 44, 55};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSortSixNumbers() {
        int[] data = new int[]{9, 9, 33, 12, 3, 15};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{3, 9, 9, 12, 15, 33};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSortTwoNumbers() {
        int[] data = new int[]{33, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{3, 33};
        assertThat(result).isEqualTo(expected);
    }
}