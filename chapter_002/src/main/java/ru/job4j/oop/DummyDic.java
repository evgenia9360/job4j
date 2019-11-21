package ru.job4j.oop;

/**
 * Фиктивный Дик.
 */
public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    /**
     * Создаем экземпляр класса Фиктивный Дик.
     *С новой сторки в консоль выводим результат работы метода.
     * @param args параметры.
     */
    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        System.out.println(dic.engToRus("Dfcz"));
    }
}
