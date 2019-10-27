package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        int dollar = rubleToDollar(360);
        int ruble1 = euroToRuble(600);
        int ruble2 = dollarToRuble(500);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("360 rubles are " + dollar + " dollar.");
        System.out.println("600 dollar are " + ruble1 + " ruble.");
        System.out.println("500 euro are " + ruble2 + " euro.");

    }
}
