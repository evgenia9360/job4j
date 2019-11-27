package ru.job4j.oop.inheritance;

public class Engineer extends Profession {
    private String specification;

    public void construction() {
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }
}
