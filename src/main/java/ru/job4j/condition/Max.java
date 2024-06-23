package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return (left > right) ? left : right;
    }

    public static int max(int left, int right, int third) {
        return (left > right) ? (left > third ? left : third) : (right > third ? right : third);
    }

    public static void main(String[] args) {
        int res = Max.max(33, 22);
        System.out.println(res);
        res = Max.max(1, -8, 557);
        System.out.println(res);
    }
}
