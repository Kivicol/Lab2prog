package status;

import ru.ifmo.se.pokemon.*;

public class Haze extends StatusMove{

    public Haze(){
        super(Type.ICE, 0, 100);
    }

    @Override

    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        p.restore();
    }

    @Override

    protected String describe() {
        return "кастует на себя Haze";
    }

}