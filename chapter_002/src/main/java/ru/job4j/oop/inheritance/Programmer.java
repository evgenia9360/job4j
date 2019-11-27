package ru.job4j.oop.inheritance;

public class Programmer extends Engineer {
    private String computerLanguage;

    public void writeCode() {
    }

    public String getComputerLanguage() {
        return computerLanguage;
    }

    public void setComputerLanguage(String computerLanguage) {
        this.computerLanguage = computerLanguage;
    }
}
