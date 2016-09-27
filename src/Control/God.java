package Control;

import Model.Weapons.*;
import Model.Monster.*;
/**
 * Created by Anthony on 23.09.2016.
 */
public class God {

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

    // Methode zum generieren von Monstern
    public static Monster createMonster(int type, int addStrength){
        if (type == 0){
            return new Slime(addStrength); //10
        } else if (type == 1) {
            return new Goblin(addStrength); // 10
        } else if (type == 2) {
            return new SlimeKing(addStrength); //15
        } else if (type == 3) {
            return new Ogre(addStrength); //15
        } else if (type == 4) {
            return new Orc(addStrength); //20
        } else if (type == 5) {
            return new Golem(addStrength); //15
        } else if (type == 6) {
            return new Dragon(addStrength); //10
        } else if (type == 7) {
            return new Demon(addStrength); //5
        }
        return null;
    }

}
