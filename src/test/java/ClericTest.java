import Game.Players.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ClericTest {

    Cleric cleric;

    @Before
    public void before() {
        cleric = new Cleric("Clarence", 10, "Vaporub");
    }

    @Test
    public void canGetName(){
        assertEquals("Clarence", cleric.getName());
    }

    @Test
    public void canGetHealingTool(){
        assertEquals("Vaporub", cleric.getHealingTool());
    }
}
