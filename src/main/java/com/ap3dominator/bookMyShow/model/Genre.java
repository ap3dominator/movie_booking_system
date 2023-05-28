package com.ap3dominator.bookMyShow.model;

public enum Genre {
    ART("Art"),
    BIOGRAPHY("Biography"),
    CHILDREN("Children"),
    FICTION("Fiction"),
    HISTORY("History"),
    MYSTERY("Mystery"),
    PHILOSOPHY("Philosophy"),
    RELIGION("Religion"),
    ROMANCE("Romance"),
    SELF_HELP("Self help"),
    TECHNICAL("Technical"),
    ACTION("Action");

    private Genre(String name)
    {
        this.name=name;
    }

    private String name;

    public String getName() {
        return name;
    }
}
