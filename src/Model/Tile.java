package Model;
import Model.Weapons.Weapon;
import Model.Monster.Monster;
/**
 * Created by 204g05 on 19.09.2016.
 */
public class Tile {
    int x,y;
    Weapon weapon;
    Monster monster;

    public Tile(int x, int y, Weapon weapon, Monster monster) {
        this.x = x;
        this.y = y;
        this.weapon = weapon;
        this.monster = monster;
    }

    public Monster getMonster() {
        return monster;
    }
    public Weapon getWeapon() {
        return weapon;
    }
    public void clear() {
        monster = null;
        weapon = null;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
