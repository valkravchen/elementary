package ru.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 100;
    }

    public static float rubleToDollar(float value) {
        return value / 90;
    }

    public static void main(String[] args) {
        float inRubleToEuro = 140;
        float expectedRubleToEuro  = 1.4f;
        float outRubleToEuro  = Converter.rubleToEuro(inRubleToEuro);
        boolean passedRubleToEuro  = expectedRubleToEuro == outRubleToEuro;
        System.out.println("140 rubles are 1.4. Test result : " + passedRubleToEuro);
        float inRubleToDollar = 180;
        float expectedRubleToDollar = 2.0f;
        float outRubleToDollar = Converter.rubleToDollar(inRubleToDollar);
        boolean passedRubleToDollar   = expectedRubleToDollar == outRubleToDollar;
        System.out.println("180 rubles are 2.0. Test result : " + passedRubleToDollar);
    }
}
