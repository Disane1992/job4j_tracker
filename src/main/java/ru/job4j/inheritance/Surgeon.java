package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private int experience;

    public Surgeon(String name, String surname, String education, String birthday, String clinic, int experience) {
        super(name, surname, education, birthday, clinic);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }
}
