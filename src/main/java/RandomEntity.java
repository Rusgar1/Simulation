package main.java;

import main.java.entity.Creature.Herbivore;
import main.java.entity.Creature.Predator;
import main.java.entity.Entity;
import main.java.entity.Grass;
import main.java.entity.Rock;
import main.java.entity.Tree;

import java.util.Random;

public class RandomEntity {
    public Entity getRandomEntity() {
        int a = new Random().nextInt(5);

        switch (a) {
            case 0 -> {
                return new Grass();
            }
            case 1 -> {
                return new Rock();
            }
            case 2 -> {
                return new Tree();
            }
            case 3 -> {
                return new Herbivore();
            }
            case 4 -> {
                return new Predator();
            }
            default -> {
                return null;
            }
        }
    }
}
