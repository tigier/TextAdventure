package Model;


public class Map {
    int[][] mapArray = {{5},{2}};

    public void extendArray(int w){
        if(w == 0){
            //erstes generiertes feld
        }
        else if(w == 1) {
            int[][] dummy = new int[mapArray.length + 1][mapArray[0].length];
            System.arraycopy(mapArray, 0, dummy, 0, mapArray.length);
            System.arraycopy(mapArray[0], 0, dummy[0], 0, mapArray[0].length);
            mapArray = dummy;
            System.out.print(mapArray.length);
        }
        else if (w == 2){
            int[][] dummy = new int[mapArray.length][mapArray[1].length + 1];
            System.arraycopy(mapArray,0,dummy,0,mapArray.length);
            System.arraycopy(mapArray[1],0,dummy[1],0,mapArray[1].length);
            mapArray = dummy;
            System.out.print(mapArray[1].length);
        }
        //else if(w == 3){
        // Mach es mal nach diesem Prinzip zuende (und gebe der map noch eine Variable mit der wir angeben können was auf dem feld liegt.)
    }
}
