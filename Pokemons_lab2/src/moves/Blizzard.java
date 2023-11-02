package moves;

import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove{
    public Blizzard(){
        super(Type.ICE, 110, 70);
    }

    @Override

    protected void applyOppEffects(Pokemon p) {

        boolean Immunity = p.hasType(Type.ICE);

        Effect Letitgo = new Effect().condition(Status.FREEZE).chance(0.1);

        if (!Immunity)
            p.addEffect(Letitgo);
    }

    @Override

    protected String describe(){
        return "использует Blizzard";
    }

}