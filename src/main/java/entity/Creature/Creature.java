package main.java.entity.Creature;

import main.java.Coordinates;
import main.java.entity.Entity;

public abstract class Creature extends Entity {
    abstract void makeMove(); //сделать ход
}

//    private int speed; // сколько клеток может пройти за 1 ход
//    private int health; // количество HP
//
//    public Creature(Coordinates coordinates, int speed, int health) {
//        super(coordinates);
//        this.speed = speed;
//        this.health = health;
//    }

//    Абстрактный класс, наследуется от Entity.
//    Существо, имеет скорость (сколько клеток может пройти за 1 ход), количество HP.
//    Имеет абстрактный метод makeMove() - сделать ход.
//    Наследники будут реализовывать этот метод каждый по-своему.
//    public final static String[] CARNIVORE = {"\uD83D\uDC05", "\uD83D\uDC0A", "\uD83D\uDC3A"};
//    public final static String[] HERBIVORE = {"\uD83D\uDC18", "\uD83D\uDC10", "\uD83D\uDC07"};
