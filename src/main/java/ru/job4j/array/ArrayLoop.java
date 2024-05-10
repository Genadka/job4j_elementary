package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] equation = new int[5];
        for (int i = 0; i < equation.length; i++) {
            equation[i] = i * 2 + 3;
        }
        for (int equation : equation) {
            System.out.println(equation);
        }
    }
}
