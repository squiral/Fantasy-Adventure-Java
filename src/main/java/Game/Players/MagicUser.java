package Game.Players;

import Game.Behaviours.IFightable;
import Game.Behaviours.IAssistable;
import Game.Items.Spell;
import Game.Items.SpellType;
import Game.MythicalCreatures.MythicalCreature;

import java.util.ArrayList;

public abstract class MagicUser extends Player implements IFightable {

    private ArrayList<Spell> spells;
    private int spellCapacity;
    private Spell equippedSpell;
    private MythicalCreature creature;
    private Boolean creatureDefending;

    public MagicUser(String name, Spell equippedSpell, MythicalCreature creature) {
        super(name, 20, 0);
        this.spells = new ArrayList<Spell>();
        this.spellCapacity = 6;
        this.equippedSpell = equippedSpell;
        this.creature = creature;
        this.creatureDefending = false;
    }

    public int getNumOfSpells(){
        return this.spells.size();
    }

    public Spell getEquippedSpell(){
        return this.equippedSpell;
    }

    public MythicalCreature getCreature(){
        return this.creature;
    }

    public boolean isCreatureDefending(){
        return this.creatureDefending;
    }

    public void equipSpell(SpellType spellType) {
        for (Spell spell : spells) {
            if (spell.getType() == spellType) {
                this.equippedSpell = spell;
            }
        }
    }

    public int fight(){
        return this.equippedSpell.getType().getDamage();
    }

    public void takeDamage(int damage){
        if(this.creatureDefending){
            this.creature.takeDamage(damage);
        } else {
            this.health -= damage;
        }
    }

    public void addSpell(Spell spell) {
        if(getNumOfSpells() < this.spellCapacity) {
            this.spells.add(spell);
        }
    }

    public void creatureDefend(boolean b) {
        this.creatureDefending = b;
    }
}