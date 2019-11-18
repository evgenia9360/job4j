package ru.job4j.calculator;

/**
 * Калькулятор соответствия веса и роста.
 */
public class Fit {
    /**
     * Формула идеального веса мужчины и женщины.
     *
     * @param height рост в метрах.
     * @return идеальный вес.
     */
    public static double manWeight(double height) {
        /**
         * Формула идеального веса мужчины.
         */
        return (height - 100) * 1.15;
    }


    public static double womanWeight(double height) {
        /**
         * формула идеального веса женщины.
         */
        return (height - 110) * 1.15;
    }

    /**
     * Вывод в консоль с новой строки идеального веса мужчины  и женщины для заданного роста.
     *
     * @param args параметры.
     */
    public static void main(String[] args) {
        double man = manWeight(180);
        double woman = womanWeight(164);
        System.out.println("Man 180 is " + man);
        System.out.println("Woman 164 is " + woman);
    }
}
