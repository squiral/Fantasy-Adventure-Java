import Game.Behaviours.IHealable;
import Game.Items.HealingTool;
import Game.Items.HealingToolType;
import Game.Players.Cleric;
import org.junit.Before;
import org.junit.Test;
import sun.jvm.hotspot.HelloWorld;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ClericTest {

    Cleric cleric;
    HealingTool healingTool;

    @Before
    public void before() {
        healingTool = new HealingTool(HealingToolType.VAPORUB);
        cleric = new Cleric("Clarence", 10, healingTool);
    }

    @Test
    public void canGetName(){
        assertEquals("Clarence", cleric.getName());
    }

    @Test
    public void canGetHealingTool(){
        assertEquals(healingTool, cleric.getHealingTool());
    }
}
