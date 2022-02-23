package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String workPlace;

    public Engineer(String name, String surname, String education, String birthday, String workPlace) {
        super(name, surname, education, birthday);
        this.workPlace = workPlace;
    }

    public String build(String building) {
        return "Построил" + building;
    }
}
