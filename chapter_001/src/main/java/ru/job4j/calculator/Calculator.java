package ru.job4j.calculator;

/**
 * Calculator.
 *
 * @author Evgeniya Tyunkova (tynek@mail.ru).
 */
public class Calculator {

    /**
     * Сложение.
     *
     * @param first  первое число.
     * @param second второе число.
     */
    public static void add(int first, int second) {
        int result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

    /**
     * Деление.
     *
     * @param first  первое число.
     * @param second второе число.
     */
    public static void div(int first, int second) {
        int result2 = first / second;
        System.out.println(first + " / " + second + " = " + result2);
    }

    /**
     * Умножение.
     *
     * @param first  первое число.
     * @param second второе число.
     */
    public static void multiply(int first, int second) {
        int result3 = first * second;
        System.out.println(first + " * " + second + " = " + result3);
    }

    /**
     * Вычитание.
     *
     * @param first  первое число.
     * @param second второе число.
     */
    public static void subtract(int first, int second) {
        int result4 = first - second;
        System.out.println(first + " - " + second + " = " + result4);
    }

    /**
     * Main
     *
     * @param args args.
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtract(10, 5);
    }
}