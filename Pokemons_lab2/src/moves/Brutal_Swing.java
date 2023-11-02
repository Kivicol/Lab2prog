package moves;

import ru.ifmo.se.pokemon.*;

public class Brutal_Swing extends SpecialMove {

    public Brutal_Swing(){

        super(Type.DARK, 60, 100);

    }

    @Override

    protected String describe() {
        return "использует Brutal Swing";
    }
}