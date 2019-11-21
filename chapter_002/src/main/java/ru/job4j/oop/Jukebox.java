package ru.job4j.oop;

/**
 * Музыкальный автомат.
 */
public class Jukebox {
    /**
     * Проиграть музыкальную композицию.
     *
     * @param position номер музыкальной композиции.
     */
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    /**
     * Создаем экцемпляр класса Музыкальный автомат.
     * Проигрываем композиции с номером 1 или 2.
     * Либо композиция не найдена.
     *
     * @param args параметры.
     */
    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        jukebox.music(1);
        jukebox.music(2);
        jukebox.music(3);
    }
}
