package pokemons;

import moves.Facade;
import moves.Mud_Bomb;
import ru.ifmo.se.pokemon.*;
import status.Haze;

public class Wooper extends Pokemon{
    public Wooper(String name, int level) {
        super(name, level);
        setStats(55, 45, 45, 15, 25, 25);
        setType(Type.WATER, Type.GROUND);
        setMove(new Facade(), new Haze(), new Mud_Bomb());
    }
}
