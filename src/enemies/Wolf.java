package enemies;

import static helpz.Constants.Enemies.*;

public class Wolf extends Enemy {

    public Wolf(float x, float y, int id) {
        super(x, y, id, WOLF);
        setStartHealth();
    }

}
