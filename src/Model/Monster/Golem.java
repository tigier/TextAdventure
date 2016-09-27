package Model.Monster;

/**
 * Created by Anthony on 25.09.2016.
 */
public class Golem extends Monster {
    // Konstruktor des Golems
    public Golem(int strength) {
        super("Golem", (100+strength), 5);
    }
}
