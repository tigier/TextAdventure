package Model;

/**
 * Created by Kot on 12.09.2016.
 */
public class Player {
    int strength = 5;
    public int xPos;
    public int yPos;
    boolean weaponEquipped = false;

    public void Kotnascher(int xPos, int yPos){
        this.xPos = xPos;
        this.yPos = yPos;
    }

    //set-Methoden
    public void setXPos(int xPos){
        this.xPos = xPos;
    }
    public void setYPos(int yPos){
        this.yPos = yPos;
    }
    public void setStrength(int strength){
        this.strength = strength;
    }
    public void setWeaponEquipped(boolean weapon){
        this.weaponEquipped = weapon;
    }

    //get-Methoden
    public int getXPos(){
        return xPos;
    }
    public int getYPos(){
        return yPos;
    }
    public int getStrength(){
        return strength;
    }
    public boolean isWeaponEquipped(){
        return weaponEquipped;
    }

    //Movement
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

}
