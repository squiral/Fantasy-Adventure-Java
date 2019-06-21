import Game.MythicalCreatures.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    Dragon dragon;

    @Before
    public void before(){
        dragon = new Dragon("Death Terry", 1000);
    }

    @Test
    public void canGetAttackPower(){
        assertEquals(10, dragon.fight());
    }

    @Test
    public void canGetName(){
        assertEquals("Death Terry", dragon.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(1000, dragon.getHealth(), 00);
    }
}






