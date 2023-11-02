package moves;

import ru.ifmo.se.pokemon.*;

public class Mud_Bomb extends SpecialMove {
    public Mud_Bomb(){
        super(Type.GROUND, 65, 85);
    }

    @Override

    protected void applyOppEffects(Pokemon p){
        if(Math.random()<0.3D){
            p.setMod(Stat.ACCURACY, -1);
        }
    }

    @Override

    protected String describe() {
        return "использует Mud Bomb";
    }
}
