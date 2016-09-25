package Control;

import Model.Weapons.*;
import Model.Monster.*;
/**
 * Created by 204g04 on 23.09.2016.
 */
public class God {

    public static Weapon createWeapon(int type) {
        if (type == 0) {
            return new Knife();
        } else if (type == 1) {
            return new Dagger();
        } else if (type == 2) {
            return new Shortsword();
        } else if (type == 3) {
            return new Axe();
        } else if (type == 4) {
            return new Scythe();
        } else if (type == 5) {
            return new Spear();
        } else if (type == 6) {
            return new Sword();
        } else if (type == 7) {
            return new Halberd();
        } else if (type == 8) {
            return new Flail();
        } else if (type == 9) {
            return new Longsword();
        } else if (type == 10) {
            return new Broadsword();
        } else if (type == 11){
            return new Lightsaber();
        }
        return null;
    }

    public static Monster createMonster(int type){
        if (type == 0){
            return new Slime();
        } else if (type == 1){
            return new Goblin();
        } else if (type == 2){
            return new SlimeKing();
        } else if (type == 3){
            return new Ogre();
        } else if (type == 4){
            return new Orc();
        } else if (type == 5){
            return new Golem();
        } else if (type == 6){
            return new Dragon();
        } else if (type == 7){
            return new Demon();
        }
        return null;
    }

}
