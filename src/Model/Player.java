package Model;
import Control.God;
import Model.Weapons.*;

public class Player {
    int strength = 5;
    public int xPos = 0;
    public int yPos = 0;
    Weapon weaponEquipped;
    int tilesCleared = 0;

    // Konstruktor des Players und die Erstellung eines Knife.
    public Player(){
        weaponEquipped = new Knife();
    }

    //set-Methods
    public void setXPos(int xPos){
        this.xPos = xPos;
    }
    public void setYPos(int yPos){
        this.yPos = yPos;
    }
    public void setStrength(int strength){
        this.strength = strength;
    }
    public void setTilesCleared(int tilesCleared){
        this.tilesCleared = tilesCleared;
    }
    public void setWeaponEquipped(int type){
        this.weaponEquipped = God.createWeapon(type);
    }

    //get-Methods
    public int getXPos(){
        return xPos;
    }
    public int getYPos(){
        return yPos;
    }
    public int getStrength(){
        return strength;
    }
    public int getTilesCleared(){
        return tilesCleared;
    }
    public Weapon getWeaponEquipped() {
        return weaponEquipped;
    }

    //Control
    public void moveToNorth(){
        this.yPos++;
    }
    public void moveToSouth(){
        this.yPos--;
    }
    public void moveToEast() {
        this.xPos++;
    }
    public void moveToWest() {
        this.xPos--;
    }
    public void clearTile(){
        tilesCleared++;
    }

}
