package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        return first > second && first > third ? first : second > third && second > first ? second : third;
    }
}
