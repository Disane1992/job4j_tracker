package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private int experience;

    public Surgeon() {

    }

    public Surgeon(int experience) {
        super("На Таганке");
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }
}
