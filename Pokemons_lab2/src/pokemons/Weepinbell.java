package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Weepinbell extends Bellsprout {
    public Weepinbell(String name, int level) {
        super(name, level);
        setStats(65, 90, 50, 55, 85, 45);
        addMove(new Slam());
    }
}
