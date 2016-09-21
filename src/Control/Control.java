package Control;
import Model.Map;
import Model.Player;


public class Control {
    FightHandler fH;
    public Map map;

    public Control(){
        Player player = new Player();
        map = new Map(player);
        fH = new FightHandler(player);
    }


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
