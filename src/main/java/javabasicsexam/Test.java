package javabasicsexam;

public class Test {
    public static void main(String[] args) {
        int target = 19;
        int[] array = {1, 4, 34, 19, 8};
        for (int index = 0; index < array.length; index++) {
            if (array[index] == target) {
                System.out.println(index);
                break;
            }
        }
    }
}
