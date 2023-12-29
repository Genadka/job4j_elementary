package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FitnessTest {
    @Test
    void whenIvanLessByFewNik() {
        int ivan = 50;
        int nik = 150;
        int result = Fitness.calc(ivan, nik);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }
}