package ru.job4j.calculator;

public class Calculator {

    public static void add(int first, int second) {
        int result =  first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

    public static void div(int first, int second) {
        int result2 =  first / second;
        System.out.println(first + " / " + second + " = " + result2);
    }

    public static void multiply(int first, int second) {
        int result3 =  first * second;
        System.out.println(first + " * " + second + " = " + result3);
    }

    public static void subtract(int first, int second) {
        int result4 =  first - second;
        System.out.println(first + " - " + second + " = " + result4);
    }

    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtract(10, 5);
    }
}