package Control;
import Model.Map;
import Model.Player;


public class Control {
    FightHandler fH;
    public Map map;
    Player player;

    public Control(){
        player = new Player();
        map = new Map(player);
    }

    // Änderung der Koordinaten des Spielers und Erstellung eines neuen "Tiles"
    public void movePlayer(String direction){
        if (direction.equals("North")) {
            map.setOldTile(map.getTile());
            player.moveToNorth();
            if(map.getMapArray().length <= player.getYPos()) {
                map.extendArray(0);
            }
            if(map.getMapArray()[player.getYPos()][player.getXPos()] == null) {
                map.tileGeneration();
            }
        }
        else if (direction.equals("South")) {
            map.setOldTile(map.getTile());
            player.moveToSouth();
            if(map.getMapArray()[player.getYPos()][player.getXPos()] == null) {
                map.tileGeneration();
            }
        }
        else if (direction.equals("East")) {
            map.setOldTile(map.getTile());
            player.moveToEast();
            if(map.getMapArray()[0].length <= player.getXPos()) {
                map.extendArray(1);
            }
            if(map.getMapArray()[player.getYPos()][player.getXPos()] == null) {
                map.tileGeneration();
            }
        }
        else if (direction.equals("West")) {
            map.setOldTile(map.getTile());
            player.moveToWest();
            if(map.getMapArray()[player.getYPos()][player.getXPos()] == null) {
                map.tileGeneration();
            }
        }
    }

    // Methode zur Erstellung eines "FightHandlers", die einen FightHandler zurückliefert
    public FightHandler createFh(){
        return new FightHandler(this.player,this.map);
    }
    // Methode zur Zurücklieferung des Players
    public Player getPlayer(){
            return player;
    }
}
