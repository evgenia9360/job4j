package ru.job4j.array;

/**
 * Дефрагментация.
 */
public class Defragment {
    /**
     * Переносит значение ячейки массива с пустым значением в конец массива.
     *
     * @param array массив.
     * @return отредактированный массив.
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            if (cell == null) {
                int i = index + 1;
                while (i != array.length) {
                    if (array[i] != null) {
                        array[index] = array[i];
                        array[i] = null;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    /**
     * Выводит с новой строки в консоль результат проверки метода compress.
     *
     * @param args параметры.
     */
    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
