package ru.job4j.converter;

/**
 * Конвертер валюты.
 */
public class Converter {
    /**
     * @param value количество денежных знаков.
     * @return вернуть результат вычисления по формуле.
     */
    public static int rubleToEuro(int value) {
        /**
         * Перевести рубли в евро.
         */
        return value / 70;
    }

    public static int euroToRuble(int value) {
        /**
         * Перевести евро в рубли.
         */
        return value * 70;
    }

    public static int rubleToDollar(int value) {
        /**
         * Перевести рубли в доллары.
         */
        return value / 60;
    }

    public static int dollarToRuble(int value) {
        /**
         * Перевести доллары в рубли.
         */
        return value * 60;
    }

    /**
     * С новой строки вывести в консоль результаты вычислений.
     *
     * @param args параметры.
     */
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
