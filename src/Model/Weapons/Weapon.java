package Model.Weapons;

/**
 * Created by 204g05 on 19.09.2016.
 */
public abstract class Weapon {
    String name;
    int strength;
    boolean canFind;

    public Weapon(String name, int strength){
        this.name = name;
        this.strength = strength;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }
    public int getStrength(){
        return this.strength;
    }

    public String getName() {
        return name;
    }
}
