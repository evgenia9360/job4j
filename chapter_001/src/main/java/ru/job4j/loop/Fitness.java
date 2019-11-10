package ru.job4j.loop;

public class Fitness {
    public int calc(int ivan, int nik) {
        int month = 0;
        int ivanStrange = ivan;
        int nikStrange = nik;
        while (ivanStrange < nikStrange) {
            month++;
            ivanStrange *= 3;
            nikStrange *= 2;
        }
        return month;
    }
}
