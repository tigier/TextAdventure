package Control;
import Model.Map;
import Model.Player;


public class Control {
    FightHandler fH;
    public Map map;
    Player player = new Player();

    public Control(){
        map = new Map(player);
        fH = new FightHandler(player,map);
    }


    public void movePlayer(String direction){
        if (direction.equals("North")) {
            map.getPlayer().moveToNorth();
        } else if (direction.equals("South")) {
            map.getPlayer().moveToSouth();
        } else if (direction.equals("East")) {
            map.getPlayer().moveToEast();
        } else if (direction.equals("West")) {
            map.getPlayer().moveToWest();
        }
    }

    public Player getPlayer(){
            return player;
    }
}
