package main.java.entity.Creature;

import main.java.entity.Creature.Creature;

public class Herbivore extends Creature {
    public Herbivore(int rows, int cols, int speed, int health) {
        super(rows, cols, speed, health);
    }

    @Override
    void makeMove() {
    }
}


//Травоядное, наследуется от Creature. Стремятся найти ресурс (траву),
// может потратить свой ход на движение в сторону травы, либо на её поглощение.

//    public final static String[] CARNIVORE = {"\uD83D\uDC05", "\uD83D\uDC0A", "\uD83D\uDC3A"};
//    public final static String[] HERBIVORE = {"\uD83D\uDC18", "\uD83D\uDC10", "\uD83D\uDC07"};