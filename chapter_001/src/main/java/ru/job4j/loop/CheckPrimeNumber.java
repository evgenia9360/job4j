package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int finish) {
        for (int i = 2; i < finish; i++) {
            if (finish % i == 0) {
                return false;
            }
        }
        return true;
    }
}