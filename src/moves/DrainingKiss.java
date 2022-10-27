package moves;
import ru.ifmo.se.pokemon.*;

public class DrainingKiss extends SpecialMove {
    public DrainingKiss() {
        super(Type.FAIRY, 50, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, + 50 * 3 / 4);
    }

    @Override
    protected String describe() {
        return "использует Draining Kiss";
    }
}
