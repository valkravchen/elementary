package ru.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Д’Артаньян";
        names[1] = "Атос";
        names[2] = "Портос";
        names[3] = "Арамис";

        for (int i = 0; i < names.length; i++) {
            System.out.println("Индекс " + i + ": " + names[i]);
        }
    }
}
