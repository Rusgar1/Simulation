package main.java.entity.Creature;

import main.java.Coordinates;
import main.java.entity.Creature.Creature;

public class Predator extends Creature {
    private int attackPower; // сила атаки.

    public Predator(Coordinates coordinates, int speed, int health) {
        super(coordinates, speed, health);
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