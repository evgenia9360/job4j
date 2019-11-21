package ru.job4j.oop;

/**
 * Студент.
 */
public class Student {
    /**
     * Играть на музыкальном инструменте.
     */
    public void music() {
        System.out.println("Tra tra tra");
    }

    /**
     * Петь.
     */
    public void song() {
        System.out.println("I believe I can fly");
    }

    /**
     * Создаем объект класса Student.
     * Вызываем метод music() 3 раза.
     * Вызываем метод song() 3 раза.
     *
     * @param args параметры.
     */
    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.song();
        petya.song();
        petya.song();
    }
}
