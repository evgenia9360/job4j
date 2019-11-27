package ru.job4j.oop.inheritance;

public class Doctor extends Profession {
    private String specialization;

    public void diagnoses() {
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
