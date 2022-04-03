package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
        Item newItem = new Item("Стол");
        System.out.println(newItem.getCreated().format(DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss")));
        Item itm = new Item("Стул");
        System.out.println(itm);
    }
}
