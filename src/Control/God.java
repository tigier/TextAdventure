package Control;

import Model.Weapons.*;
import Model.Monster.*;
/**
 * Created by 204g04 on 23.09.2016.
 */
public class God {

    public static Weapon createWeapon(int type){
        if (type == 0){
            return new Knife();
        }
        else if (type == 1){
            return new Shortsword();
        }
        else if (type == 2){
            return new Scythe();
        }
        else if (type == 3){
            return new Sword();
        }
        else if (type == 4){
            return new Flail();
        }
        else if (type == 5){
            return new Lightsaber();
        }
    }

    public static Monster createMonster(int type){
        if (type == 0){
            return new Slime();
        }
    }


}
