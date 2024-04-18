package main.java;

import main.java.entity.Entity;

import java.util.HashMap;

public class WorldMap {
    //    Карта, содержит в себе коллекцию для хранения существ и их расположения.
//    Советую не спешить использовать двумерный массив или список списков,
//    а подумать какие ещё коллекции могут подойти.
    HashMap<Coordinates, Entity> worldMap = new HashMap<>();

    public void mapEntity(int rows, int cols) {
    }

    public void setEntity(Coordinates coordinates, Entity entity) { //установить фигуры
        entity.coordinates = coordinates; // фигура тоже знает координаты надо обновить
        worldMap.put(coordinates, entity); // доска знает координаты
    }

    public void isSquareEmpty(Coordinates coordinates) { // проверяет по координатам является ли ячейка пустой
          // если ключа нет то возвращает true
    }

    public Entity getEntity(Coordinates coordinates) {//получить фигуру по координатам

        return null;
    }


    public void setupDefaultEntityPositions() {

    }

    public static boolean isSquareDark(Coordinates coordinates) {
        return false;
    }
}
