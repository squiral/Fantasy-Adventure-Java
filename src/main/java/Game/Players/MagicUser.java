package Game.Players;

import Game.Behaviours.IAssistable;
import Game.Items.Spell;
import Game.Items.SpellType;

import java.util.ArrayList;

public abstract class MagicUser extends Player {

    private ArrayList<Spell> spells;
    private Spell equippedSpell;
    private IAssistable creature;
    private Boolean creatureDefending;

    public MagicUser(String name, ArrayList<Spell> spells, IAssistable creature){
        super(name, 20, 0);
        this.spells = spells;
        this.creature = creature;
        this.creatureDefending = false;
    }

    public void equipSpell(SpellType spellType){
        for(Spell spell : spells){
            if(spell.type() == spellType){
                equippedSpell = spell;
            }
        }
    }

}
