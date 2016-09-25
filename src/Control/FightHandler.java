package Control;
import Model.Player;
import Model.Tile;
import Model.Map;
import Model.Monster.Monster;
public class FightHandler {
    Player player;
    Map map;
    Tile tile;
    Monster monster;
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
        if (monster.getStrength() > strength) {
            escapeChance = Math.random()*49+1;
        }
        else if (strength > monster.getStrength())
        {
            escapeChance = Math.random()*99+50;
         }

      }

    public void fight(){
        if (player.getStrength()+)
    }
}
