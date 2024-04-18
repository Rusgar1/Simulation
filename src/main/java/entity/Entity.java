package main.java.entity;

import main.java.Coordinates;

public abstract class Entity {
    //    Корневой абстрактный класс для всех существ и объектов существующих в симуляции
    public Coordinates coordinates;

    public Entity(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
}
