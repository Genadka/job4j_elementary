package ru.job4j.loop;

public class Counter {

    public static int sum(int start, int finish) {
        int sum = 0;
        for (int j = start; j <= finish; j++) {
            sum = sum + j;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sumByEven = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sumByEven = sumByEven + i;
            }
        }
        return sumByEven;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(-1, 1));
        System.out.println(sum(2, 11));
        System.out.println(sum(-10, 1));
        System.out.println(sum(4, 500));
        System.out.println(sumByEven(-5, 10));
        System.out.println(sumByEven(-55, 7));
    }
}