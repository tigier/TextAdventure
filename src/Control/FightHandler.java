package Control;
import Model.Player;
import Model.Tile;
import Model.Map;
import Model.Monster.Monster;
import Model.Weapons.Weapon;

public class FightHandler {
    Player player;
    Map map;
    Tile tile;
    Monster monster;
    Weapon weapon;
    int strength;
    double escapeChance;

    public FightHandler(Player player, Map map) {
        this.player = player;
        this.map = map;
    }

    public void FightHandler(Player player){
        strength = player.getStrength();
    }

    public void escape(){
        player.setXPos(map.getOldTile().getX());
        player.setYPos(map.getOldTile().getY());
    }

    public void fight(){
        tile = map.getTile();
        monster = tile.getMonster();
        weapon = player.getWeaponEquipped();
        if ((player.getStrength()+weapon.getStrength()) >= monster.getStrength()){
            fightWon(this.tile);
        }
        if ((player.getStrength()+weapon.getStrength()) < monster.getStrength()){
            fightLost();
        }
    }

    public void fightWon(Tile tile){
        tile.clear();
        player.setTilesCleared(player.getTilesCleared()+1);
    }
    public void fightLost(){

    }

}
