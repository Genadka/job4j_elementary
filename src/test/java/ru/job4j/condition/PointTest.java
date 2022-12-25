package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenMinus10to10Then2() {
        double expected = 2;
        int x1 = -1;
        int y1 = 0;
        int x2 = 1;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
            }

    @Test
    public void when20to80Then6() {
        double expected = 6;
        int x1 = 2;
        int y1 = 0;
        int x2 = 8;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when21to815Then15Dot23() {
        double expected = 15.23;
        int x1 = 2;
        int y1 = 1;
        int x2 = 8;
        int y2 = 15;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}