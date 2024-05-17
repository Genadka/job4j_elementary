package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {1, 6, 5, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 5, 6};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortOne() {
        int[] data = new int[] {1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1};
        assertThat(result).containsExactly(expected);
    }
}