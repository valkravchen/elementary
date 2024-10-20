package ru.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount += amount * percent;
            amount -= salary;
            year++;
        }
        return year;
    }

    public static void main(String[] args) {
        double amount = 100;
        double percent = 0.5;
        double salary = 70;
        System.out.println(year(amount, salary, percent));
    }
}