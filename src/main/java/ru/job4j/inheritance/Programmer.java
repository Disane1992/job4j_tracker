package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private int experience;

    public Programmer() {

    }

    public Programmer(int experience) {
        super("На Таганке");
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }
}