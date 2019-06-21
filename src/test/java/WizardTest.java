import Game.Behaviours.IAssistable;
import Game.Items.Spell;
import Game.Items.SpellType;
import Game.MythicalCreatures.Dragon;
import Game.MythicalCreatures.MythicalCreature;
import Game.Players.Wizard;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WizardTest {

    Wizard wizard;
    Dragon dragon;
    Spell spell1;
    Spell spell2;


    @Before
    public void before(){
        dragon = new Dragon("Snappy", 50);
        spell1 = new Spell(SpellType.FIRE);
        spell2 = new Spell(SpellType.ICE);
        wizard = new Wizard("Usidore", spell1, dragon);
    }

    @Test
    public void hasName(){
        assertEquals("Usidore", wizard.getName());
    }

    @Test
    public void hasCreature(){
        assertTrue(wizard.getCreature() instanceof Dragon);
    }

    @Test
    public void hasEquipedSpellWhenCreated(){
        assertTrue(wizard.getEquippedSpell() instanceof Spell);
    }

    @Test
    public void hasNoSpellsWhenCreated(){
        assertEquals(0, wizard.getNumOfSpells());
    }
    @Test
    public void canAddSpell(){
        wizard.addSpell(spell1);
        wizard.addSpell(spell2);
        assertEquals(2, wizard.getNumOfSpells());
    }



}
