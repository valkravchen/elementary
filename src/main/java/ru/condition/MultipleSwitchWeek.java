package ru.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        String lowerCaseName = name.toLowerCase();
        return switch (lowerCaseName) {
            case "понедельник", "monday" -> 1;
            case "вторник", "tuesday" -> 2;
            case "среда", "wednesday" -> 3;
            case "четверг", "thursday" -> 4;
            case "пятница", "friday" -> 5;
            case "суббота", "saturday" -> 6;
            case "воскресенье", "sunday" -> 7;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        System.out.println(numberOfDay("понедельник"));
        System.out.println(numberOfDay("вТорник"));
        System.out.println(numberOfDay("WEDNESDAY"));
    }
}
