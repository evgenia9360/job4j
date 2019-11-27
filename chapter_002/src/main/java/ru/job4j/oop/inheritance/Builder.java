package ru.job4j.oop.inheritance;

public class Builder extends Engineer {
    private String buildMethod;

    public void building() {
    }

    public String getBuildMethod() {
        return buildMethod;
    }

    public void setBuildMethod(String buildMethod) {
        this.buildMethod = buildMethod;
    }
}
