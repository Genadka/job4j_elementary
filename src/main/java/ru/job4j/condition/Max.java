package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return (left > right) ? left : right;
    }

    public static int max(int left, int right, int third) {
        return max(max(left, right), third);
    }

    public static int max(int left, int right, int third, int fourth) {
        return max(max(max(left, right), third), fourth);
    }

    public static void main(String[] args) {
        int res = Max.max(33, 22);
        System.out.println(res);
        res = Max.max(1, -8, -88);
        System.out.println(res);
        res = Max.max(1,5,8,-8);
        System.out.println(res);
    }
}
