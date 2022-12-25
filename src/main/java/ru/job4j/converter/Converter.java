package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float dollarToRuble(float value) {
        float rsl = value * 60;
        return rsl;
    }

    public static float euroToRuble(float value) {
        float rsl = value * 70;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euros.");
        float dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollars.");
        float ruble1 = Converter.dollarToRuble(2);
        System.out.println("2 dollars are " + ruble1 + " rubles.");
        float ruble2 = Converter.euroToRuble(3);
        System.out.println("3 euros are " + ruble2 + " rubles.");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euros. Test result : " + passed);
        in = 180;
        expected = 3;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("180 rubles are 3 dollars. Test result : " + passed);
        in = 2;
        expected = 120;
        out = Converter.dollarToRuble(in);
        passed = expected == out;
        System.out.println("2 dollars are 120 rubles. Test result : " + passed);
        in = 4;
        expected = 280;
        out = Converter.euroToRuble(in);
        passed = expected == out;
        System.out.println("4 euros are 280 rubles. Test result : " + passed);

    }
}
