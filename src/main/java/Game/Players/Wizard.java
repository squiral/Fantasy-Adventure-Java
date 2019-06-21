package Game.Players;

import Game.Behaviours.IAssistable;
import Game.Items.Spell;

import java.util.ArrayList;

public class Wizard extends MagicUser {

    public Wizard(String name, ArrayList<Spell> spells, IAssistable creature){
        super(name, spells, creature);
    }
}
