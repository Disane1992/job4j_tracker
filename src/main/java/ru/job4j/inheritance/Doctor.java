package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String clinic;

    public Doctor() {

    }

    public Doctor(String clinic) {
        super("Иван", "Иванов", "Врачебное", "01.01.2020");
        this.clinic = clinic;
    }

    public boolean heal(boolean success) {
        return success;
    }
}
