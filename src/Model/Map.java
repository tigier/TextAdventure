package Model;
import Model.Tile;

public class Map {
    Player player = new Player();
    Tile[][] mapArray = new Tile[1][1];

    public Map() {
        mapArray[0][0]=new Tile(0,0,0);
    }

    //TODO ergänze tile gneration
    public void extendArray(int w){
        if(w == 0){
        }
        else if(w == 1) {
            Tile[][] dummy = new Tile[mapArray.length + 1][mapArray[0].length];
            System.arraycopy(mapArray, 0, dummy, 0, mapArray.length);
            System.arraycopy(mapArray[0], 0, dummy[0], 0, mapArray[0].length);
            mapArray = dummy;
            System.out.print(mapArray.length);
        }
        else if (w == 2){
            Tile[][] dummy = new Tile[mapArray.length][mapArray[1].length + 1];
            System.arraycopy(mapArray,0,dummy,0,mapArray.length);
            System.arraycopy(mapArray[1],0,dummy[1],0,mapArray[1].length);
            mapArray = dummy;
            System.out.print(mapArray[1].length);
        }
    }

    public Player getPlayer() {
        return player;
    }
}
