package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private int experience;

    public Dentist() {

    }

    public Dentist(int experience) {
        super("На Таганке");
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }
}
