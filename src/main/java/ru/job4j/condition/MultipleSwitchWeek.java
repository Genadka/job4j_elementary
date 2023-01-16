package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        int numWeek = switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресенье", "Sunday" -> 7;
            default -> -1;
        };
        return numWeek;
    }

    public static void main(String[] args) {
        int nuberWeek = numberOfDay("Wednesday");
        System.out.println(nuberWeek);
        nuberWeek = numberOfDay("Пятница");
        System.out.println(nuberWeek);
        nuberWeek = numberOfDay("май");
        System.out.println(nuberWeek);
    }
}
