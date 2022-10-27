package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;
public class Gallade extends Kirlia {
    public Gallade(String name, int level) {
        super(name, level);
        setStats(38, 35, 35, 65, 55, 50);
        setType(Type.PSYCHIC, Type.FAIRY);
        addMove(new AerialAce());
    }
}