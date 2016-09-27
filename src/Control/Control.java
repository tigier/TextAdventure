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
            player.moveToNorth();
            if(map.getMapArray().length-1 < player.getYPos()) {
                map.extendArray(0);
            }            System.out.print(map.getMapArray().length+""+map.getMapArray()[0].length);
            if(map.getMapArray()[player.getYPos()][player.getXPos()] == null) {
                map.tileGeneration();
            }
        }
        else if (direction.equals("South")) {
            map.getPlayer().moveToSouth();
            if(map.getMapArray()[player.getYPos()][player.getXPos()] == null) {
                map.tileGeneration();
            }
        }
        else if (direction.equals("East")) {
            map.getPlayer().moveToEast();
            if(map.getMapArray()[0].length-1 < player.getXPos()) {
                map.extendArray(1);
            }            System.out.print(map.getMapArray().length+""+map.getMapArray()[0].length);
            if(map.getMapArray()[player.getYPos()][player.getXPos()] == null) {
                map.tileGeneration();
            }
        }
        else if (direction.equals("West")) {
            map.getPlayer().moveToWest();
            if(map.getMapArray()[player.getYPos()][player.getXPos()] == null) {
                map.tileGeneration();
            }
        }
    }

    public Player getPlayer(){
            return player;
    }
}
