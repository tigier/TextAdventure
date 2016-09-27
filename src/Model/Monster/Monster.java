package Model.Monster;
import Model.Player;
/**
 * Created by Anthony on 19.09.2016.
 */
public abstract class Monster {
    String name;
    double strength;
    int type;
    Player player;

    public Monster(String name, double strength, int type){
        this.name = name;
        this.strength = strength;
        this.type = type;
        this.player = player;
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
