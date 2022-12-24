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
        float in2 = 180;
        float expected2 = 3;
        float out2 = Converter.rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("180 rubles are 3 dollars. Test result : " + passed2);
        float in3 = 2;
        float expected3 = 120;
        float out3 = Converter.dollarToRuble(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("2 dollars are 120 rubles. Test result : " + passed3);
        float in4 = 4;
        float expected4 = 280;
        float out4 = Converter.euroToRuble(in4);
        boolean passed4 = expected4 == out4;
        System.out.println("4 euros are 280 rubles. Test result : " + passed4);

    }
}
