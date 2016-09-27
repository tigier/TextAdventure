package Control;

import Model.Weapons.*;
import Model.Monster.*;
import Model.Player;
/**
 * Created by Anthony on 23.09.2016.
 */
public class God {

    public static int additionalStrength(int max,int min, Player player){
        int kot = player.getTilesCleared()+ (int)((Math.random()*(max*2))+min);
        return kot;
    }

    // Methode zum generieren von Monstern
    public static Monster createMonster(int type, Player player){
        if (type == 0){
            return new Slime(additionalStrength(5,-5,player)); //10
        } else if (type == 1) {
            return new Goblin(additionalStrength(5,-10,player)); // 10
        } else if (type == 2) {
            return new SlimeKing(additionalStrength(10,-10,player)); //15
        } else if (type == 3) {
            return new Ogre(additionalStrength(10,-10,player)); //15
        } else if (type == 4) {
            return new Orc(additionalStrength(10,-10,player)); //20
        } else if (type == 5) {
            return new Golem(additionalStrength(20,-20,player)); //15
        } else if (type == 6) {
            return new Dragon(additionalStrength(30,-20,player)); //10
        } else if (type == 7) {
            return new Demon(additionalStrength(40,-30,player)); //5
        }
        return null;
    }

    // Methode zum generieren neuer Waffen
    public static Weapon createWeapon(int type) {
        if (type == 0) {
            return new Dagger();
        } else if (type == 1) {
            return new Shortsword();
        } else if (type == 2) {
            return new Axe();
        } else if (type == 3) {
            return new Scythe();
        } else if (type == 4) {
            return new Spear();
        } else if (type == 5) {
            return new Sword();
        } else if (type == 6) {
            return new Halberd();
        } else if (type == 7) {
            return new Flail();
        } else if (type == 8) {
            return new Longsword();
        } else if (type == 9) {
            return new Broadsword();
        } else if (type == 10) {
            return new Lightsaber();
        }
        return null;
    }



}
