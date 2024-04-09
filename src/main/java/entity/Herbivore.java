package main.java.entity;

public class Herbivore extends Creature{
    //Травоядное, наследуется от Creature. Стремятся найти ресурс (траву),
    // может потратить свой ход на движение в сторону травы, либо на её поглощение.


    public Herbivore(int speed, int health) {
        super(speed, health);
    }

    @Override
    void makeMove() {
    }
}
