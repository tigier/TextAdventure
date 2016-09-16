package Model;


public class Map {
    int[][] mapArray = new int[5][2];

    public void extendArrayRigth(){
        int[][] dummy = new int[mapArray.length + 1][mapArray[0].length];
        System.arraycopy(mapArray,0,dummy,0,mapArray.length);
        System.arraycopy(mapArray[0],0,dummy[0],0,mapArray[0].length);
        mapArray = dummy;
        System.out.print(mapArray.length);
    }
    public void extendArrayDown(){
        int[][] dummy = new int[mapArray.length][mapArray[0].length + 1];
        System.arraycopy(mapArray,0,dummy,0,mapArray.length);
        System.arraycopy(mapArray[0],0,dummy[0],0,mapArray[0].length);
        mapArray = dummy;
        System.out.print(mapArray[0].length);
    }

}
