package Control;
import Model.Player;
import Model.Tile;

public class FightHandler {

    int strength;
    double escapeChance;

    public void FightHandler(Player player){
        strength = player.getStrength();
    }


    public void escape(){
        if (Tile.monster.strength > strength) {
            escapeChance = Math.random()*49+1;
        }
        else if (strength > Tile.monster.strength)
        {
            escapeChance = Math.random()*99+50;
         }

      }

    public void fight(){

    }
}
