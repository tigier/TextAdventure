package Control;
import Model.Map;


public class Control {
    FightHandler fH = new FightHandler();
    public Map map = new Map();


    public void movePlayer(String direction){
        if (direction.equals("North")){
            map.getPlayer().moveToNorth();
            if(map.mapArray){
        }
        else if (direction.equals("South"))
        {
            map.getPlayer().moveToSouth();
        }
        else if (direction.equals("East"))
        {
            map.getPlayer().moveToEast();
        }
        else if (direction.equals("West")){
            map.getPlayer().moveToWest();
        }
    }



}
