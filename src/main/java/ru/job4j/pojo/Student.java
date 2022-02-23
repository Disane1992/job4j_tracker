package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String fIO;
    private String group;
    private Date dateEntry;

    public String getfIO() {
        return fIO;
    }

    public void setfIO(String fIO) {
        this.fIO = fIO;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getDateEntry() {
        return dateEntry;
    }

    public void setDateEntry(Date dateEntry) {
        this.dateEntry = dateEntry;
    }
}
