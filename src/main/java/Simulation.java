package main.java;

public class Simulation {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;

        WorldMap worldMap = new WorldMap();
        worldMap.setupDefaultEntityPositions(rows, cols);
    }
}

//    Главный класс приложения, включает в себя:
//
//Карту
//Счётчик ходов
//Рендерер поля
//Actions - список действий, исполняемых перед стартом симуляции или на каждом ходу (детали ниже)
//Методы:
//
//nextTurn() - просимулировать и отрендерить один ход
//startSimulation() - запустить бесконечный цикл симуляции и рендеринга
//pauseSimulation() - приостановить бесконечный цикл симуляции и рендеринга

//    public final static String[] CARNIVORE = {"\uD83D\uDC05", "\uD83D\uDC0A", "\uD83D\uDC3A"};
//    public final static String[] HERBIVORE = {"\uD83D\uDC18", "\uD83D\uDC10", "\uD83D\uDC07"};
//    public final static String[] GRASS = {"\uD83C\uDF3E", "\uD83C\uDF3F", "\uD83C\uDF40"};
//    public final static String[] ROCK = {"⛰", "\uD83E\uDEA8", "\uD83C\uDFD4️"};
//    pblic final static String[] TREE = {"\uD83C\uDF32", "\uD83C\uDF34", "\uD83C\uDF33"};

