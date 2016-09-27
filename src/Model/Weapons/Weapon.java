package Model.Weapons;

/**
 * Created by Anthony on 19.09.2016.
 */
public abstract class Weapon {
    String name;
    int strength;
    int type;

    public Weapon(String name, int strength, int type){
        this.name = name;
        this.strength = strength;
        this.type = type;
    }

    // nötige set- & get-Methoden
    public void setStrength(int strength){
        this.strength = strength;
    }
    public int getStrength(){
        return this.strength;
    }

    public String getName() {
        return name;
    }

    public int getType(){
        return type;
    }
}
