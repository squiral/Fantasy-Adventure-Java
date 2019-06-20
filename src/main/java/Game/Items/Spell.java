package Game.Items;

public class Spell extends Item {

    private SpellType type;

    public Spell(int weight, SpellType type) {
        super(weight);
        this.type = type;
    }

    

}
