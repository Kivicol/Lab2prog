package moves;
import ru.ifmo.se.pokemon.*;

public class Focus_Blast extends SpecialMove {

    public Focus_Blast(){
        super(Type.FIGHTING, 120, 70);
    }

    @Override

    protected void applyOppEffects(Pokemon p){
        if(Math.random()<0.1D){
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    @Override

    protected String describe() {
        return "использует Focus blast";
    }

}
