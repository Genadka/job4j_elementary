package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean i : data) {
            if (i != data[data.length - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
