package Model;
import Model.Tile;

public class Map {
    private Player player;
    Tile[][] mapArray = new Tile[1][1];

    public Map(Player player) {
        this.player = player;
        mapArray[0][0]=new Tile(0,0,0);
    }

    //TODO contents
    public void extendArray(int w){
        if(w == 0) {
            Tile[][] dummy = new Tile[mapArray.length + 1][mapArray[0].length];
            System.arraycopy(mapArray, 0, dummy, 0, mapArray.length);
            System.arraycopy(mapArray[0], 0, dummy[0], 0, mapArray[0].length);
            mapArray = dummy;
            mapArray[player.getYPos()][player.getXPos()] = new Tile(player.getXPos(),player.getYPos(),0);
            System.out.print(mapArray.length);
        }
        else if (w == 1){
            Tile[][] dummy = new Tile[mapArray.length][mapArray[1].length + 1];
            System.arraycopy(mapArray,0,dummy,0,mapArray.length);
            System.arraycopy(mapArray[1],0,dummy[1],0,mapArray[1].length);
            mapArray = dummy;
            mapArray[player.getYPos()][player.getXPos()] = new Tile(player.getXPos(),player.getYPos(),0);
            System.out.print(mapArray[1].length);
        }
    }

    public int getTilePosition(){
        return ;
    }

    public Player getPlayer() {
        return player;
    }
}
