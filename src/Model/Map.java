package Model;
import Control.God;
import Model.Weapons.*;
import Model.Monster.*;

public class Map {
    private Player player;
    Tile[][] mapArray = new Tile[1000][1000];
    Tile oldTile;
    int spawnChance;
    int whatToSpawn;
    Weapon spawnWeapon;
    Monster spawnMonster;

    public Map(Player player) {
        this.player = player;
        mapArray[0][0]=new Tile(0,0,null,null,this.player);
    }

    //TODO contents
    public void extendArray(int w){
        if(w == 0) {
            Tile[][] dummy = new Tile[player.getYPos() + 1][mapArray[0].length];
            for (int i = mapArray.length; 0 < i; i--) {
                System.arraycopy(mapArray[i - 1], 0, dummy[i - 1], 0, mapArray[i - 1].length);
            }
            mapArray = dummy;
        }
        else if (w == 1){
            Tile[][] dummy = new Tile[mapArray.length][player.getXPos()];
            for (int i = 0; i < mapArray.length; i++) {
                System.arraycopy(mapArray[mapArray.length-i], 0, dummy[mapArray.length-i], 0, mapArray[mapArray.length-1].length);
            }
            mapArray = dummy;
        }
    }

    public void tileGeneration(){
        spawnChance = (int)(Math.random()*99+1);
        whatToSpawn = (int)(Math.random()*99+1);
        if (spawnChance > 40){
            if (whatToSpawn <= 10){
                spawnWeapon = God.createWeapon(whatWeaponToSpawn());
            }
            else if (whatToSpawn > 10){
                spawnMonster = God.createMonster(whatMonsterToSpawn(),additionalStrength());
                if (spawnMonster.getStrength() < 1){
                    spawnMonster.setStrength(1);
                }
            }
        }
        mapArray[player.getYPos()][player.getXPos()] = new Tile(player.getXPos(),player.getYPos(),spawnWeapon,spawnMonster,this.player);
    }

    public Tile getTile(){
        return mapArray[player.getYPos()][player.getXPos()];
    }
    public Player getPlayer() {
        return player;
    }
    public Tile getOldTile() {
        return oldTile;
    }

    public Tile[][] getMapArray() {
        return mapArray;
    }

    public int whatMonsterToSpawn(){
        if (player.getStrength()+player.getWeaponEquipped().getStrength() <= 30){
            int thisMonster = (int)(Math.random()*99+1);
            if (thisMonster <= 25) {
                return 0;
            }
            if (thisMonster > 25 && thisMonster <= 50){
                return 1;
            }
            if (thisMonster > 50 && thisMonster <= 75){
                return 2;
            }
            if (thisMonster > 75){
                return 3;
            }
        }
        int thisMonster = (int)(Math.random()*99+1);
        if (thisMonster <= 10) {
            return 0;
        } else if (thisMonster > 10 && thisMonster <= 20){
            return 1;
        } else if (thisMonster > 20 && thisMonster <= 35){
            return 2;
        } else if (thisMonster > 35 && thisMonster <= 50){
            return 3;
        } else if (thisMonster > 50 && thisMonster <= 70){
            return 4;
        } else if (thisMonster > 70 && thisMonster <= 85){
            return 5;
        } else if (thisMonster > 85 && thisMonster <= 95){
            return 6;
        } else {
            return 7;
        }
    }
    public int additionalStrength(){
        int kot = player.getTilesCleared()+ (int)((Math.random()*40)-20);
        return kot;
    }
    public int whatWeaponToSpawn(){
        int thisOne = (player.getWeaponEquipped().getType()+1);
        return thisOne;
    }

}
