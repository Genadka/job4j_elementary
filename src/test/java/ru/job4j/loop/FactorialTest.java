package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {
    @Test
    void whenCalculateFactorialForSevenThenFiveThousandForty() {
        int expected = 5040;
        int number = 7;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

}