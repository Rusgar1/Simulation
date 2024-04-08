package main.java;

public abstract class Creature extends Entity {
//    Абстрактный класс, наследуется от Entity.
//    Существо, имеет скорость (сколько клеток может пройти за 1 ход), количество HP.
//    Имеет абстрактный метод makeMove() - сделать ход.
//    Наследники будут реализовывать этот метод каждый по-своему.

    private int speed; // сколько клеток может пройти за 1 ход
    private int health; // количество HP

    public Creature(int speed, int health) {
        this.speed = speed;
        this.health = health;
    }

    abstract void makeMove(); //сделать ход
}
