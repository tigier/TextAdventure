package Model;
import Control.God;
import Model.Weapons.*;

public class Player {
    int strength = 5;
    public int xPos;
    public int yPos;
    Weapon weaponEquipped = new Knife();
    int tilesCleared = 0;


    public void Player(int xPos, int yPos){
        this.xPos = xPos;
        this.yPos = yPos;
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
