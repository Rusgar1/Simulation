package main.java;

public class Predator extends Creature{
    //Хищник, наследуется от Creature. В дополнение к полям класса Creature,
    // имеет силу атаки.
    // На что может потратить ход хищник:
    //Переместиться (чтобы приблизиться к жертве - травоядному)
    //Атаковать травоядное. При этом количество HP травоядного
    // уменьшается на силу атаки хищника. Если значение HP жертвы опускается до 0,
    // травоядное исчезает

    private int attackPower; // сила атаки.

    public Predator(int speed, int health, int attackPower) {
        super(speed, health);
        this.attackPower = attackPower;
    }

    @Override
    void makeMove() {

    }
}
