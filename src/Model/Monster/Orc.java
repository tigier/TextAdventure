package Model.Monster;

/**
 * Created by Anthony on 25.09.2016.
 */
public class Orc extends Monster {
    // Konstruktor des Orcs
    public Orc(int strength) {
        super("Orc", (41+strength), 4);
    }
}
