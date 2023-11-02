package moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove{

    public Facade(){
        super(Type.NORMAL, 70,100);
    }

    @Override

    protected void applyOppDamage(Pokemon p, double power) {
        Status s = p.getCondition();
        if (s.equals(Status.BURN) || s.equals(Status.PARALYZE) || s.equals(Status.POISON)) {
            super.applyOppDamage(p, power * 2);
        }
    }

    @Override

    protected String describe(){
        return "использует Фасаду йоу";
    }

}