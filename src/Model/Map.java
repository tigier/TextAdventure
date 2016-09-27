package Model;

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
            Tile[][] dummy = new Tile[player.getYPos() + 1][mapArray[0].length];
            for (int i = mapArray.length; 0 < i; i--) {
                System.arraycopy(mapArray[i - 1], 0, dummy[i - 1], 0, mapArray[i - 1].length);
            }
            mapArray = dummy;
        }
        else if (w == 1){
            Tile[][] dummy = new Tile[mapArray.length][player.getXPos()+1];
            for (int i = player.getXPos(); 0 < i; i--) {
                System.arraycopy(mapArray[i-1], 0, dummy[i - 1], 0, mapArray[i - 1].length);
            }
            mapArray = dummy;
        }
    }

    public void tileGeneration(){
        mapArray[player.getYPos()][player.getXPos()] = new Tile(player.getXPos(),player.getYPos(),null,null,this.player);
    }

    public Tile getTile(){
        return mapArray[player.getYPos()][player.getXPos()];
    }
    public Player getPlayer() {
        return player;
    }
    public Tile getOldTile() {
        return oldTile;
    }

    public Tile[][] getMapArray() {
        return mapArray;
    }
}
