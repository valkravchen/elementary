package javabasicsexam;

public class EditArrayElement {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int indexToEdit = 2;
        int newValue = 100;
        numbers[indexToEdit] = newValue;

        System.out.println("Массив после редактирования:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}