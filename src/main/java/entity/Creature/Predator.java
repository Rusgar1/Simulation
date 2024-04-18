package main.java.entity.Creature;

import main.java.entity.Creature.Creature;

public class Predator extends Creature {
    private int attackPower; // сила атаки.

    public Predator(int rows, int cols, int speed, int health) {
        super(rows, cols, speed, health);
    }

    @Override
    void makeMove() {
    }
}


//Хищник, наследуется от Creature. В дополнение к полям класса Creature,
// имеет силу атаки.
// На что может потратить ход хищник:
//Переместиться (чтобы приблизиться к жертве - травоядному)
//Атаковать травоядное. При этом количество HP травоядного
// уменьшается на силу атаки хищника. Если значение HP жертвы опускается до 0,
// травоядное исчезает