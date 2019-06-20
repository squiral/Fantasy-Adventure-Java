package Game.Items;

public class Spell extends Item {

    private SpellType type;

    public Spell(SpellType type) {
        super(1);
        this.type = type;
    }



}
