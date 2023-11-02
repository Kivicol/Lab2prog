package moves;

import ru.ifmo.se.pokemon.*;

public class Venoshock extends SpecialMove {
    public Venoshock(){
        super(Type.POISON, 65, 100);
    }

    @Override

    protected void applyOppDamage(Pokemon p, double power) {
        Status s = p.getCondition();
        if (s.equals(Status.POISON)) {
            super.applyOppDamage(p, power * 2);
        }
    }

    @Override

    protected String describe() {
        return "использует Веношокированивание";
    }
}
