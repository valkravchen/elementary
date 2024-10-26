package ru.live;

public class TemplateDemo {  // Переименован для большей ясности
    public static void main(String[] args) {  // Шаблон psvm
        // Цикл for, созданный через шаблон fori
        for (int index = 0; index <= 10; index++) {
            // Вывод значения index на консоль через шаблон sout
            System.out.println(index);
        }
    }
}
