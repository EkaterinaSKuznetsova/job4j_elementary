package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
      return value / 70;
    }

    public static float rubleToDollar(float value) {
       return value / 60;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float inDollar = 600;
        float expectedDollar = 10;
        float outDollar = Converter.rubleToDollar(inDollar);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("600 rubles are 10 dollars. Test result : " + passedDollar);

    }
}


