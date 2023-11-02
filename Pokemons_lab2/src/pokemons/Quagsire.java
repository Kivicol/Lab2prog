package pokemons;

import moves.Facade;
import moves.Focus_Blast;
import moves.Mud_Bomb;
import ru.ifmo.se.pokemon.*;
import status.Haze;

public class Quagsire extends Pokemon{
    public Quagsire(String name, int level) {
        super(name, level);
        setStats(95, 85, 85, 35, 65, 65);
        setType(Type.WATER, Type.GROUND);
        addMove(new Focus_Blast());
    }
}