package Game.Players;

import Game.Behaviours.IFightable;
import Game.Behaviours.IAssistable;
import Game.Items.Spell;
import Game.Items.SpellType;

import java.util.ArrayList;

public abstract class MagicUser extends Player implements IFightable {

    private ArrayList<Spell> spells;
    private Spell equippedSpell;
    private IAssistable creature;
    private Boolean creatureDefending;

    public MagicUser(String name, ArrayList<Spell> spells, IAssistable creature) {
        super(name, 20, 0);
        this.spells = spells;
        this.creature = creature;
        this.creatureDefending = false;
    }

    public void equipSpell(SpellType spellType) {
        for (Spell spell : spells) {
            if (spell.getType() == spellType) {
                equippedSpell = spell;
            }
        }
    }

    public int fight(){
        return equippedSpell.getType().getDamage();
    }
}