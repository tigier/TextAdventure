package Model;
import Model.Tile;

public class Map {
    private Player player;
    Tile[][] mapArray = new Tile[1][1];
    Tile oldTile;

    public Map(Player player) {
        this.player = player;
        mapArray[0][0]=new Tile(0,0,null,null,this.player);
    }

    //TODO contents
    public void extendArray(int w){
        if(w == 0) {
            oldTile = getPosition();
            Tile[][] dummy = new Tile[mapArray.length + 1][mapArray[0].length];
            System.arraycopy(mapArray, 0, dummy, 0, mapArray.length);
            System.arraycopy(mapArray[0], 0, dummy[0], 0, mapArray[0].length);
            mapArray = dummy;
            mapArray[player.getYPos()][player.getXPos()] = new Tile(player.getXPos(),player.getYPos(),null,null,this.player);
            System.out.print(mapArray.length);
        }
        else if (w == 1){
            oldTile = getPosition();
            Tile[][] dummy = new Tile[mapArray.length][mapArray[1].length + 1];
            System.arraycopy(mapArray,0,dummy,0,mapArray.length);
            System.arraycopy(mapArray[1],0,dummy[1],0,mapArray[1].length);
            mapArray = dummy;
            mapArray[player.getYPos()][player.getXPos()] = new Tile(player.getXPos(),player.getYPos(),null,null,this.player);
            System.out.print(mapArray[1].length);
        }
    }

    public Tile getPosition(){
        return mapArray[player.getYPos()][player.getXPos()];
    }

    public Player getPlayer() {
        return player;
    }
    public Tile getOldTile() {
        return oldTile;
    }
}
