package com.ap3dominator.bookMyShow.model;


public enum Status {

    BOOKED("booked"),
    PENDING("pending"),

    AVAILABLE("available");

    private Status(String name)
    {
        this.name=name;
    }

    private String name;

    public String getName() {
        return name;
    }

}
