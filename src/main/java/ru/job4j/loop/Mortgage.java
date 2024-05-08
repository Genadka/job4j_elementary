package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        double creditDebt = amount;
        while (creditDebt > 0) {
            creditDebt = creditDebt + (creditDebt * (percent * 0.01)) - salary;
            year++;
        }
        return year;
    }

}
