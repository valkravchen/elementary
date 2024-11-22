package ru.array;

public class ArrayChar {
    public static void main(String[] args) {
        char[] word = {'Д', 'р', 'у', 'з', 'ь', 'я'};
        char[] pref = {'Д', 'р', 'у'};
        for (int index = 0; index < pref.length; index++) {
            if (pref[index] != word[index]) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}

