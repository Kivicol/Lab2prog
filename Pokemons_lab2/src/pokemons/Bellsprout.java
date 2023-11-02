package pokemons;

import moves.Venoshock;
import ru.ifmo.se.pokemon.*;
import status.Sweet_Scent;

public class Bellsprout extends Pokemon{
    public Bellsprout(String name, int level) {
        super(name, level);
        setStats(50, 75, 35, 40, 70, 30);
        setType(Type.GRASS, Type.DARK);
        setMove(new Sweet_Scent(), new Venoshock());
    }
}
