package main.java.entity;

//    public final static String[] GRASS = {"\uD83C\uDF3E", "\uD83C\uDF3F", "\uD83C\uDF40"};
public class Grass extends Entity {
    public String grass;

    public Grass(int rows, int cols, String grass) {
        super(rows, cols);
        this.grass = "\uD83C\uDF3E";
    }
}
