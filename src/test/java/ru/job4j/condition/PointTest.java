package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenMinus10to10Then2() {
        double expected = 2;
        Point a = new Point(-1, 0);
        Point b = new Point(1, 0);
        double distance = a.distance(b);
        Assert.assertEquals(expected, distance, 0.01);
            }

    @Test
    public void when20to80Then6() {
        double expected = 6;
        Point a = new Point(2, 0);
        Point b = new Point(8, 0);
        double distance = a.distance(b);
        Assert.assertEquals(expected, distance, 0.01);
    }

    @Test
    public void when21to815Then15Dot23() {
        double expected = 15.23;
        Point a = new Point(2, 1);
        Point b = new Point(8, 15);
        int x1 = 2;
        int y1 = 1;
        int x2 = 8;
        int y2 = 15;
        double distance = a.distance(b);
        Assert.assertEquals(expected, distance, 0.01);
    }
}