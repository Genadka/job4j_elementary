package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subAndDiv(double first, double second) {
        return division(first, second)
                + subtraction(first, second);
    }

    public static double sumMulDivSub(double first, double second) {
        return sum(first, second)
                + multiply(first, second) + division(first, second) + subtraction(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subAndDiv(10, 20));
        System.out.println("Результат расчета равен: " + sumMulDivSub(10, 20));
    }
}
