package ru.job4j.condition;

public class SqMax {
    public static int max(int first, int second, int third, int forth) {
        if (first > second && first > third && first > forth) {
            return first;
        } else if (second > first && second > third && second > forth) {
            return second;
        } else if (third > first && third > second && third > forth) {
            return third;
        } else {
            return forth;
        }
    }
}
