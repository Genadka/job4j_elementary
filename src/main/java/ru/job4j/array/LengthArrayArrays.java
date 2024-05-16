package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{0}, {1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
        for (int[] number : numbers) {
            System.out.println(number.length);
        }
    }
}
