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
        tile = map.getPosition();
        monster = tile.getMonster();
        double escape = Math.random()*99+1;
        if (monster.getStrength() > strength) {
            escapeChance = Math.random()*49+1;
        }
        else if (strength > monster.getStrength())
        {
            escapeChance = Math.random()*99+50;
        }

    }

    public void fight(){
        tile = map.getPosition();
        monster = tile.getMonster();
        weapon = player.getWeaponEquipped();
        if ((player.getStrength()+weapon.getStrength()) > monster.getStrength()){
            fightWon(this.tile);
        }
        if ((player.getStrength()+weapon.getStrength()) > monster.getStrength()){
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
