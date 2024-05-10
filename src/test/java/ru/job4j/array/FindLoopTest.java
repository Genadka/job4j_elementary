package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;

class FindLoopTest {

    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int element = 5;
        int result = FindLoop.indexOf(data, element);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas2Then0() {
        int[] data = new int[] {11, 522, 6688, 84, 4564, 2};
        int element = 6688;
        int result = FindLoop.indexOf(data, element);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10Then0() {
        int[] data = new int[] {11, 522, 6688, 84, 4564, 2};
        int element = 10;
        int result = FindLoop.indexOf(data, element);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}