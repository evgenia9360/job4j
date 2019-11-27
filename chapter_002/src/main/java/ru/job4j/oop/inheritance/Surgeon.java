package ru.job4j.oop.inheritance;

public class Surgeon extends Doctor {
    private String direction;

    public void operates() {
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
