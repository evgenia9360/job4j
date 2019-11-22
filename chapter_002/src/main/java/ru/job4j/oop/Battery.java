package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
        another.load = this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery one = new Battery(7);
        Battery two = new Battery(2);
        one.exchange(two);
        System.out.println("one : " + one.load + ". two : " + two.load);
    }
}
