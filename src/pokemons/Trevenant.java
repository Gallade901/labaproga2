package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;
public class Trevenant extends Phantump {
    public Trevenant(String name, int level) {
        super(name, level);
        setStats(85, 110, 76, 65, 82, 56);
        setType(Type.GHOST, Type.GRASS);
        addMove(new BrutalSwing());
    }
}