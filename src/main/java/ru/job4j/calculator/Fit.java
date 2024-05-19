package ru.job4j.calculator;

public class Fit {

    private static final double MAN_WEIGHT_COEFFICIENT = 1.15;
    private static final double WOMAN_WEIGHT_COEFFICIENT = 1.15;

    public static double calculateWeight(short height, double coefficient, int adjustment) {
        return (height - adjustment) * coefficient;
    }

    public static double manWeight(short height) {
        return calculateWeight(height, MAN_WEIGHT_COEFFICIENT, 100);
    }

    public static double womanWeight(short height) {
        return calculateWeight(height, WOMAN_WEIGHT_COEFFICIENT, 110);
    }

    public static void main(String[] args) {
        short height = 170;
        double manWeight = Fit.manWeight(height);
        double womanWeight = Fit.womanWeight(height);
        System.out.printf("Man weight with height %d cm is %.2f kilograms%n", height, manWeight);
        System.out.printf("Woman weight with height %d cm is %.2f kilograms%n", height, womanWeight);
    }
}
