package ru.job4j.inheritance;

public class Builder extends Engineer {
    private int experience;

    public Builder() {

    }

    public Builder(int experience) {
        super("На Таганке");
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }
}
