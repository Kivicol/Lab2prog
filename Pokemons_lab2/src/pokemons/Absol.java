package pokemons;

import moves.Blizzard;
import moves.Brutal_Swing;
import moves.Flamethrower;
import moves.Rock_Slide;
import ru.ifmo.se.pokemon.*;

public class Absol extends Pokemon {
    public Absol(String name, int level) {
        super(name, level);
        setStats(65, 130, 60, 75, 75, 60);
        setType(Type.DARK);
        setMove(new Blizzard(), new Flamethrower(), new Brutal_Swing(), new Rock_Slide());
    }
}