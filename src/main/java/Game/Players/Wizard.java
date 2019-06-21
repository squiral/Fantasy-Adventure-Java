package Game.Players;

import Game.Behaviours.IAssistable;
import Game.Items.Spell;
import Game.MythicalCreatures.MythicalCreature;

import java.util.ArrayList;

public class Wizard extends MagicUser {

    public Wizard(String name, ArrayList<Spell> spells, MythicalCreature creature){
        super(name, spells, creature);
    }


}
