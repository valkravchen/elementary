package ru.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean first = data[0];
        for (boolean value : data) {
            if (value != first) {
                result = false;
                break;
            }
        }
        return result;
    }
}

