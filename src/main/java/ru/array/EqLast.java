package ru.array;

public class EqLast {
    public static void main(String[] args) {
        char[] left = {'Л', 'ю', 'б', 'о', 'в', 'ь'};
        char[] right = {'М', 'о', 'р', 'к', 'о', 'в', 'ъ'};
        boolean result = left[left.length - 1] == right[right.length - 1];
        System.out.println(result);
    }
}

