package Model;

/**
 * Created by 204g04 on 19.09.2016.
 */
public abstract class Monster {
    String name;
    double strength;

    public Monster(String name, double strength){
        this.name = name;
        this.strength = strength;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }
    public double getStrength(){
        return this.strength;
    }
    public String getName(){
        return this.name;
    }

}
