package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return  (ab + ac) > bc && (ac + bc) > ab && (ab + bc) > ac;
    }

    public static void main(String[] args) {
        boolean res = Triangle.exist(21, 22, 15);
        System.out.println(res);
        res = Triangle.exist(16, 14, 90);
        System.out.println(res);
    }
}
