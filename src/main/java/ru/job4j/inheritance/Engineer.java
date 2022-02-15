package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String workPlase;

    public Engineer() {

    }

    public Engineer(String workPlase) {
        super("Иван", "Иванов", "Врачебное", "01.01.2020");
        this.workPlase = workPlase;
    }

    public String build(String building) {
        return "Построил" + building;
    }
}
