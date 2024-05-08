package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("длинна массива ages " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Длинна массива surnames " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Длинна массива prices " + prices.length);
        String[] name = new String[4];
        name[0] = "IvanVasilev";
        System.out.println(name[0]);
        name[1] = "NikolaVitalivich";
        System.out.println(name[1]);
        name[2] = "NikitaSergeevish";
        System.out.println(name[2]);
        name[3] = "IlyaIsakievich";
        System.out.println(name[3]);
    }
}
