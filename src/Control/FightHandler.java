package Control;
import Model.Player;
import Model.Peperoni;
import Model.Tile;
public class FightHandler {
    Player player = new Player();
    Peperoni peperoni = new Peperoni();


    int strength = player.getStrength() + peperoni.getStrength();
    double escapeChance;
    public void FightHandler(){

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
