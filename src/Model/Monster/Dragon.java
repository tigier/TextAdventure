package Model.Monster;

/**
 * Created by Anthony on 25.09.2016.
 */
public class Dragon extends Monster {
    // Konstruktor des Dragons
    public Dragon(int strength) {
        super("Dragon", (240+strength), 6);
    }
}
