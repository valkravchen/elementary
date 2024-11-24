package ru.array;

public class EndsWith {
    public static void main(String[] args) {
        boolean result = true;
        char[] word = {'Д', 'р', 'у', 'ж', 'б', 'а'};
        char[] post = {'ж', 'б', 'а'};
        for (int index = 0; index < post.length; index++) {
            if (post[post.length - 1 - index] != word[word.length - 1 - index]) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}
