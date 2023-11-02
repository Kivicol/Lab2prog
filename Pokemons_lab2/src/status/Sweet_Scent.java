package status;
import ru.ifmo.se.pokemon.*;
public class Sweet_Scent extends StatusMove{
    public Sweet_Scent(){
        super(Type.NORMAL, 0, 100);
    }


    protected void applyOppEffect(Pokemon p) {
        p.setMod(Stat.EVASION, -1);
    }

    @Override

    protected String describe() {
        return "кастует на себя сладкий запашок";
    }
}
