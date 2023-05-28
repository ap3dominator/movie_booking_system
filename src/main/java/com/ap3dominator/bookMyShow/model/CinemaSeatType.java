package com.ap3dominator.bookMyShow.model;


public enum CinemaSeatType {

    PLATINUM("platinum"),
    GOLD("gold"),
    SILVER("silver");

    private CinemaSeatType(String name)
    {
        this.name=name;
    }

    private String name;

    public String getName() {
        return name;
    }

}
