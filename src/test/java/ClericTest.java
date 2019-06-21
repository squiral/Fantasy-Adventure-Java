import Game.Behaviours.IHealable;
import Game.Items.HealingTool;
import Game.Items.HealingToolType;
import Game.Players.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    HealingTool healingTool1;
    HealingTool healingTool2;
    HealingTool healingTool3;
    HealingTool healingTool4;

    @Before
    public void before() {
        healingTool1 = new HealingTool(HealingToolType.VAPORUB);
        healingTool2 = new HealingTool(HealingToolType.CALPOL);
        healingTool3 = new HealingTool(HealingToolType.PLASTER);
        healingTool4 = new HealingTool(HealingToolType.SPLINT);
        cleric = new Cleric("Clarence", 20, healingTool1);
    }

    @Test
    public void hasName(){
        assertEquals("Clarence", cleric.getName());
    }

    @Test
    public void hasHealingTool(){
        assertEquals(healingTool1, cleric.getHealingTool());
    }

    @Test
    public void has100health() {
        assertEquals(100, cleric.getHealth());
    }

    @Test
    public void hasInventorySize() {
        assertEquals(4, cleric.getInventorySize());
    }

    @Test
    public void hasMaxCarryWeight() {
        assertEquals(20, cleric.getMaxCarryWeight());
    }

    @Test
    public void canAddItem(){
        cleric.addItem(healingTool1);
        assertEquals(1, cleric.getNumOfItemsInInventory());
    }

    @Test
    public void cantAddItemIfInventoryFull(){
        cleric.addItem(healingTool1);
        cleric.addItem(healingTool2);
        cleric.addItem(healingTool3);
        cleric.addItem(healingTool4);
        cleric.addItem(healingTool3);
        assertEquals(4, cleric.getNumOfItemsInInventory());
    }

    @Test
    public void canTakeDamage(){
        cleric.takeDamage(10);
        assertEquals(90, cleric.getHealth());
    }

    @Test
    public void canRecover(){
        cleric.takeDamage(30);
        cleric.recover(10);
        assertEquals(80, cleric.getHealth());
    }

    @Test
    public void cantRecoverOver100Health(){
        cleric.recover(20);
        assertEquals(100, cleric.getHealth());
    }

    @Test
    public void canEquipWeapon(){
        cleric.equipHealingTool(healingTool1);
        assertEquals(HealingToolType.VAPORUB, cleric.getHealingTool().getType());
    }



}


