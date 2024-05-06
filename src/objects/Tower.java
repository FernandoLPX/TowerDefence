package objects;

public class Tower {

    private int x, y, id, towerType, cdTyck, dmg;
    private float range, cooldown;

    public Tower(int x, int y, int id, int towerType) {
        this.x = x;
        this.y = y;
        this.id = id;
        this.towerType = towerType;
        setDefaultDmg();
        setDefaultRange();
        setDefaultCooldown();
    }

    public void update() {
        cdTyck++;
    }

    public boolean isCooldownOver() {
        return cdTyck >= cooldown;
    }

    public void resetCooldown() {
        cdTyck = 0;
    }

    private void setDefaultCooldown() {
        cooldown = helpz.Constants.Towers.GetStartCooldown(towerType);
    }

    private void setDefaultRange() {
        range = helpz.Constants.Towers.GetStartRange(towerType);
    }

    private void setDefaultDmg() {
        dmg = helpz.Constants.Towers.GetStartDmg(towerType);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTowerType() {
        return towerType;
    }

    public void setTowerType(int towerType) {
        this.towerType = towerType;
    }

    public int getDmg() {
        return dmg;
    }

    public float getRange() {
        return range;
    }

    public float getCooldown() {
        return cooldown;
    }

}
