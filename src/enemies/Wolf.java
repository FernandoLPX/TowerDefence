package enemies;

import static helpz.Constants.Enemies.*;

import managers.EnemyManager;

public class Wolf extends Enemy {

    public Wolf(float x, float y, int id, EnemyManager em) {
        super(x, y, id, WOLF, em);
    }

}
