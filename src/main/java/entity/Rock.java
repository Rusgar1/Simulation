package main.java.entity;

import main.java.Coordinates;

//    Rock, Tree - статичные объекты.
public class Rock extends Entity {
    public String rock;

    public Rock(Coordinates coordinates, String tree) {
        super(coordinates);
        this.rock = "\uD83E\uDEA8";
    }
}
