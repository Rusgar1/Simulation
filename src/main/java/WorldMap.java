package main.java;

import main.java.entity.Entity;

import java.util.HashMap;

public class WorldMap {
    //    Карта, содержит в себе коллекцию для хранения существ и их расположения.
//    Советую не спешить использовать двумерный массив или список списков,
//    а подумать какие ещё коллекции могут подойти.
    HashMap<Coordinates, Entity> worldMap = new HashMap<>();

    public void setupDefaultEntityPositions(int rows, int cols) {
        RandomEntity randomEntity = new RandomEntity();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                worldMap.put(new Coordinates(i, j), randomEntity.getRandomEntity());
                System.out.print(randomEntity.getRandomEntity().getIcon());
            }
            System.out.println();
        }

    }

    public void setEntity(Coordinates coordinates, Entity entity) { //установить фигуры
//        entity.coordinates = coordinates; // фигура тоже знает координаты надо обновить
        worldMap.put(coordinates, entity); // доска знает координаты
    }

    public void isSquareEmpty(Coordinates coordinates) { // проверяет по координатам является ли ячейка пусто
    }// если ключа нет то возвращает true

    public Entity getEntity(Coordinates coordinates) {//получить фигуру по координатам
        return null;
    }
}
