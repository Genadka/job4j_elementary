package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusFourToTenThenTwentyFour() {
        int start = -4;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 24;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusFiftyFiveToSevenThenMinusSevenHundredFortyFour() {
        int start = -55;
        int finish = 7;
        int result = Counter.sumByEven(start, finish);
        int expected = -744;
        assertThat(result).isEqualTo(expected);
    }

}