package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        if (post.length > word.length) {
            return false;
        }
        for (int i = post.length - 1, j = word.length - 1; i > -1; i--, j--) {
            if (word[j] != post[i]) {
                result = false;
                break;
            }
        }
        // проверить. что массив word имеет последние элементы одинаковые с post
        return result;
    }
}
