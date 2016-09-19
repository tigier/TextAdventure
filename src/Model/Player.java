package Model;

public class Player {
    int strength = 5;
    public int xPos;
    public int yPos;
    boolean weaponEquipped = false;
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
    public void setWeaponEquipped(boolean weapon){
        this.weaponEquipped = weapon;
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

    public boolean isWeaponEquipped(){
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

}
