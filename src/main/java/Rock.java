package main.java;

public class Rock extends Entity {
    //    Rock, Tree - статичные объекты.

    public final static String[] CARNIVORE = {"\uD83D\uDC05", "\uD83D\uDC0A", "\uD83D\uDC3A"};
    public final static String[] HERBIVORE = {"\uD83D\uDC18", "\uD83D\uDC10", "\uD83D\uDC07"};
    public final static String[] GRASS = {"\uD83C\uDF3E", "\uD83C\uDF3F", "\uD83C\uDF40"};
    public final static String[] ROCK = {"⛰", "\uD83E\uDEA8", "\uD83C\uDFD4️"};
    public final static String[] TREE = {"\uD83C\uDF32", "\uD83C\uDF34", "\uD83C\uDF33"};

    public static void main(String[] args) {
        System.out.println(CARNIVORE[0]);
        System.out.println(HERBIVORE[0]);
        System.out.println(GRASS[0]);
        System.out.println(ROCK[1]);
        System.out.println(TREE[0]);



    }
}
