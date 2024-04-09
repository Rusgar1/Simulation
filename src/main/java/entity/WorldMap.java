package main.java.entity;

import java.util.HashMap;

public class WorldMap {
//    Карта, содержит в себе коллекцию для хранения существ и их расположения.
//    Советую не спешить использовать двумерный массив или список списков,
//    а подумать какие ещё коллекции могут подойти.
    HashMap<String, HashMap<String,Integer>> table = new HashMap<>();
    public void mapEntity() {
    }

    public void printMap(HashMap<String, HashMap<String,Integer>> table){
        for (String row : table.keySet()) {
            HashMap<String,Integer> rowData = table.get(row);
            for (String col : table.keySet()) {
                System.out.print(table.get(col));
            }
            System.out.println();
        }
    }

    public void mapEntity(int rows, int cols) {
        HashMap<String, Integer> row1 = new HashMap<>();
        row1.put("col1", 1);
        row1.put("col2", 2);
        row1.put("col3", 3);
        table.put("row1", row1);

        HashMap<String, Integer> row2 = new HashMap<>();
        row2.put("col1", 1);
        row2.put("col2", 2);
        row2.put("col3", 3);
        table.put("row2", row2);

        HashMap<String, Integer> row3 = new HashMap<>();
        row3.put("col1", 1);
        row3.put("col2", 2);
        row3.put("col3", 3);
        table.put("row3", row3);

        printMap(table);
    }
}
