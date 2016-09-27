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
            if(map.getMapArray().length-1 < player.getXPos()) {
                map.extendArray(0);
            }
            map.tileGeneration();
        }
        else if (direction.equals("South")) {
            map.getPlayer().moveToSouth();
        }
        else if (direction.equals("East")) {
            map.getPlayer().moveToEast();
            if(map.getMapArray()[0].length-1 < player.getXPos()) {
                map.extendArray(1);
            }
        }
        else if (direction.equals("West")) {
            map.getPlayer().moveToWest();
        }
    }

    public Player getPlayer(){
            return player;
    }
}
