package Control;

import Model.Weapons.*;
import Model.Monster.*;
import Model.Player;
/**
 * Created by 204g04 on 23.09.2016.
 */
public class God {

    public static Weapon createWeapon(Player player) {
        if (player.getWeaponEquipped().equals(null)) {
            return new Knife();
        } else if (player.getWeaponEquipped().equals(Knife)) {
            return new Dagger();
        } else if (player.getWeaponEquipped().equals(Dagger)) {
            return new Shortsword();
        } else if (player.getWeaponEquipped().equals(Shortsword)) {
            return new Axe();
        } else if (player.getWeaponEquipped().equals(Axe)) {
            return new Scythe();
        } else if (player.getWeaponEquipped().equals(Scythe)) {
            return new Spear();
        } else if (player.getWeaponEquipped().equals(Spear)) {
            return new Sword();
        } else if (player.getWeaponEquipped().equals(Sword)) {
            return new Halberd();
        } else if (player.getWeaponEquipped().equals(Halberd)) {
            return new Flail();
        } else if (player.getWeaponEquipped().equals(Flail)) {
            return new Longsword();
        } else if (player.getWeaponEquipped().equals(Longsword)) {
            return new Broadsword();
        } else if (player.getWeaponEquipped().equals(Broadsword)){
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
