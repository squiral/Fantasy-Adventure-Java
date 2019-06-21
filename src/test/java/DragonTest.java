import Game.MythicalCreatures.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    Dragon dragon;

    @Before
    public void before(){
        dragon = new Dragon("Death Terry");
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
        assertEquals(80, dragon.getHealth());
    }

    @Test
    public void canTakeDamage(){
        dragon.takeDamage(20);
        assertEquals(60, dragon.getHealth());
    }

    @Test
    public void canDefend(){
        assertEquals(true, dragon.canDefend());
    }

    @Test
    public void cantDefendWhenBelow10Health(){
        dragon.takeDamage(71);
        assertEquals(false, dragon.canDefend());
    }
}






