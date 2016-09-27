package Model.Monster;
/**
 * Created by Anthony on 25.09.2016.
 */
public class Demon extends Monster {
    // Constructor des Demons
    public Demon(int strength) {
        super("Demon", (350+strength), 7);
    }
}
