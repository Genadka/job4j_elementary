package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    public void whenMaxMinus33To22Then22() {
        int left = -33;
        int right = 22;
        int result = Max.max(left, right);
        int expected = 22;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax33To33Then33() {
        int left = 33;
        int right = 33;
        int result = Max.max(left, right);
        int expected = 33;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax33To22Then33() {
        int left = 33;
        int right = 22;
        int result = Max.max(left, right);
        int expected = 33;
        assertThat(result).isEqualTo(expected);
    }
}