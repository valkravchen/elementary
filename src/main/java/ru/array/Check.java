package ru.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean first = data[0];
        for (boolean value : data) {
            if (value != first) {
                return false;
            }
        }
        return true;
    }
}

