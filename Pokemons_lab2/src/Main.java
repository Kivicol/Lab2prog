import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle fight = new Battle();
        fight.addAlly(new Absol("Волк", 3));
        fight.addAlly(new Wooper("Аксолотль", 1));
        fight.addAlly(new Quagsire("Тюлень", 2));
        fight.addFoe(new Bellsprout("Горохострел", 1));
        fight.addFoe(new Weepinbell("Боб", 2));
        fight.addFoe(new Victreebel("Кабачок", 3));
        fight.go();
    }
}