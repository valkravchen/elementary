package ru.array;

public class ArrayChar {
    public static void main(String[] args) {
        boolean result = true;
        char[] word = {'Д', 'р', 'у', 'з', 'ь', 'я'};
        char[] pref = {'д', 'р', 'У'};
        for (int index = 0; index < pref.length; index++) {
            if (pref[index] != word[index]) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}

