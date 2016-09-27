package Model.Monster;

/**
 * Created by Anthony on 23.09.2016.
 */
public class Slime extends Monster {
    // Konstruktor des Slimes
    public Slime(int strength) {
        super("Slime", (5+strength), 0);
    }
}
