package Game.Players;

import Game.Behaviours.IFightable;
import Game.Behaviours.IAssistable;
import Game.Items.Spell;
import Game.Items.SpellType;
import Game.MythicalCreatures.MythicalCreature;

import java.util.ArrayList;

public abstract class MagicUser extends Player implements IFightable {

    private ArrayList<Spell> spells;
    private Spell equippedSpell;
    private MythicalCreature creature;
    private Boolean creatureDefending;

    public MagicUser(String name, ArrayList<Spell> spells, MythicalCreature creature) {
        super(name, 20, 0);
        this.spells = spells;
        this.creature = creature;
        this.creatureDefending = false;
    }

    public int getNumOfSpells(){
        return this.spells.size();
    }

    public MythicalCreature getCreature(){
        return this.creature;
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

    public void addSpell(Spell spell) {
        this.spells.add(spell);
    }
}