package ru.job4j.array;

import java.util.Arrays;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] equation = new int[5];
        for (int i = 0; i < equation.length; i++) {
            equation[i] = i * 2 + 3;
        }
        for (int num : equation) {
            System.out.println(num);
        }
    }
}