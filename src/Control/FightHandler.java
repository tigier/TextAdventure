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

    public FightHandler(Player player, Map map) {
        this.player = player;
        this.map = map;
    }

    // Methode zur Flucht vor einem Kampf. Der Spieler bewegt sich auf die vorherigen Koordinaten.
    public void escape(){
        player.setXPos(map.getOldTile().getX());
        player.setYPos(map.getOldTile().getY());
    }

    // Methode zur Regelung des Kampfes. Bei größerer Stärke gewinnt der Spieler. Bei geringerer oder gleicher stirbt dieser.
    public boolean fight(){
        tile = map.getTile();
        monster = tile.getMonster();
        weapon = player.getWeaponEquipped();
        if ((player.getStrength()+weapon.getStrength()) > monster.getStrength()){
            fightWon(this.tile);
            return true;
        } else if ((player.getStrength()+weapon.getStrength()) <= monster.getStrength()){
            fightLost();
            return false;
        }
        return false;
    }

    // "Räumung" des Feldes, nach einem gewonnenen Kampf.
    public void fightWon(Tile tile){
        tile.clear();
        player.setTilesCleared(player.getTilesCleared()+1);
    }

    public void fightLost(){

    }

}
