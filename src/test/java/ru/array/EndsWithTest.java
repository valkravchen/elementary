package ru.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class EndsWithTest {
    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'С', 'ч', 'а', 'с', 'т', 'ь', 'е'};
        char[] post = {'ч', 'а', 'с', 'т', 'ь', 'е'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'С', 'ч', 'а', 'с', 'т', 'ь', 'е'};
        char[] post = {'ч', 'а', 'с', 'т', 'ь'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result).isFalse();
    }
}