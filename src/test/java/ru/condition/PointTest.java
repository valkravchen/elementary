package ru.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        double expected = 2;
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void when11to11then2() {
        Point a = new Point(1, 1);
        Point b = new Point(1, 1);
        double out = a.distance(b);
        double expected = 0;
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void when23to73then5() {
        Point a = new Point(2, 3);
        Point b = new Point(7, 3);
        double out = a.distance(b);
        double expected = 5;
        assertThat(out).isEqualTo(expected);
    }
}