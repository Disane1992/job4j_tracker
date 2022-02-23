package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student first = new Student();
        first.setfIO("Иванов Иван Иванович");
        first.setGroup("1504");
        first.setDateEntry(new Date());

        System.out.println(first.getfIO() + " learn in group " + first.getGroup() + " sinсe " + first.getDateEntry());
    }
}
