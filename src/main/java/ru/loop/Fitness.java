package ru.loop;

public class Fitness {
    public static int calc(int ivan, int nikolay) {
        int month = 0;
        while (ivan <= nikolay) {
            ivan *= 3;
            nikolay *= 2;
            month += 1;
        }
        return month;
    }
}

