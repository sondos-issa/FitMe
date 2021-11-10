package com.example.twoactivities.model;

public class Train {
    private String name;
    private String time;
    private String days;
    private String weeks;

    public Train(String name, String time, String days, String weeks) {
        this.name = name;
        this.time = time;
        this.days = days;
        this.weeks = weeks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getWeeks() {
        return weeks;
    }

    public void setWeeks(String weeks) {
        this.weeks = weeks;
    }
}
