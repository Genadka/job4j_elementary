package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        double creditDebt = 0;
        while (creditDebt > 0) {
            creditDebt = amount + (amount * (percent * 0.01)) - salary;
            year++;
        }
        return year;
    }

}
