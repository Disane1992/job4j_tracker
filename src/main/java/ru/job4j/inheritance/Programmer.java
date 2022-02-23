package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private int experience;

    public Programmer(String name, String surname, String education, String birthday, String workPlace, int experience) {
        super(name, surname, education, birthday, workPlace);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }
}