package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Victreebel extends Weepinbell {
    public Victreebel(String name, int level) {
        super(name, level);
        setStats(80, 105, 65, 70, 100, 70);
        addMove(new Facade());
    }
}
