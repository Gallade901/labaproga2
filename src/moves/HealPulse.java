package moves;
import ru.ifmo.se.pokemon.*;

public class HealPulse extends SpecialMove {
    public HealPulse() {
        super(Type.PSYCHIC, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        double hp;
        Effect e;
        hp = def.getStat(Stat.HP);
        hp /= 2;
        e = new Effect().turns(0).stat(Stat.HP, -(int)hp);
        def.setCondition(e);
    }

    @Override
    protected String describe() {
        return "использует Heal Pulse";
    }
}
