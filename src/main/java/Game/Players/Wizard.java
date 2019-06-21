package Game.Players;

import Game.Behaviours.IAssistable;
import Game.Items.Spell;
import Game.MythicalCreatures.MythicalCreature;

import java.util.ArrayList;

public class Wizard extends MagicUser {

    public Wizard(String name, Spell equippedSpell, MythicalCreature creature){
        super(name, equippedSpell, creature);
    }


}
