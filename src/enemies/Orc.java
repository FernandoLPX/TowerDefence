package enemies;

import static helpz.Constants.Enemies.*;

import managers.EnemyManager;

public class Orc extends Enemy {

    public Orc(float x, float y, int id, EnemyManager em) {
        super(x, y, id, ORC, em);
        health = 50;
    }

}
