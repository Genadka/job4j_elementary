package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = height - 100 * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = height - 110 * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println("Man weight with height 187 is " + man + " kilograms");
        System.out.println("Woman weight with height 187 is " + woman + " kilograms");
    }
}
