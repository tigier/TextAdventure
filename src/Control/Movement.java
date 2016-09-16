package Control;
import View1.TextAdventure;
import Model.Player;

/**
 * Created by Anthony on 12.09.2016.
 */
public class Movement {

    Player player = new Player();

    public static void main(String[] args){
        TextAdventure view = new TextAdventure();
    }

    public void movePlayer(String direction){
        if (direction.equals("North")){
            player.moveToNorth();
        }
        else if (direction.equals("South"))
        {
            player.moveToSouth();
        }
        else if (direction.equals("East"))
        {
            player.moveToEast();
        }
        else if (direction.equals("West")){
            player.moveToWest();
        }
    }
}
