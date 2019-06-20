import Game.Items.Spell;
import Game.Items.SpellType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellTest {

    Spell spell;

    @Before
    public void before(){
        spell = new Spell(SpellType.LIGHTNING);
    }

    @Test
    public void canGetSpellDamage(){
        assertEquals(15, SpellType.LIGHTNING.getValue());
    }
}
