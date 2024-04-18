package main.java.entity;

import main.java.Coordinates;

//    Rock, Tree - статичные объекты.
public class Tree extends Entity {
    public String tree;

    public Tree(Coordinates coordinates, String tree) {
        super(coordinates);
        this.tree = "\uD83C\uDF32";
    }
}
