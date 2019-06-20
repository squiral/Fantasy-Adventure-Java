import Game.Items.HealingTool;
import Game.Items.HealingToolType;
import Game.Items.Weapon;
import Game.Items.WeaponType;
import Game.Players.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class KnightTest {

    Knight knight;
    Weapon weapon1;
    Weapon weapon2;
    HealingTool healingTool;

    @Before
    public void before(){
        weapon1 = new Weapon(WeaponType.RUSTY_SWORD);
        weapon2 = new Weapon(WeaponType.DAGGER);
        healingTool = new HealingTool(HealingToolType.VAPORUB);
        knight = new Knight("Sir Square Jaw", weapon1);
    }

    @Test
    public void hasName(){
        assertEquals("Sir Square Jaw", knight.getName());
    }

    @Test
    public void hasWeapon(){
        assertTrue(knight.getWeapon() instanceof Weapon);
    }

    @Test
    public void canAddEquipedWeaponWeight(){
        assertEquals(12, knight.getCurrentWeightTotal());
    }

    @Test
    public void has100Health(){
        assertEquals(100, knight.getHealth());
    }

    @Test
    public void hasInventorySize(){
        assertEquals(4, knight.getInventorySize());
    }

    @Test
    public void hasMaxCarryWeight(){
        assertEquals(50, knight.getMaxCarryWeight());
    }

    @Test
    public void canAddItem(){
        knight.addItem(healingTool);
        assertEquals(1, knight.getNumOfItemsInInventory());
    }

    @Test
    public void cantAddItemIfInventoryFull(){
        knight.addItem(weapon2);
        knight.addItem(weapon2);
        knight.addItem(weapon2);
        knight.addItem(weapon2);
        knight.addItem(weapon2);
        assertEquals(4, knight.getNumOfItemsInInventory());
    }

    @Test
    public void canAddItemWeight(){
        knight.addItem(healingTool);
        assertEquals(22, knight.getCurrentWeightTotal());
    }

    @Test
    public void cantAddItemIfItemWillMaxOutCarryWeight(){
        knight.addItem(weapon1);
        knight.addItem(weapon1);
        knight.addItem(weapon1);
        knight.addItem(weapon1);
        assertEquals(48, knight.getCurrentWeightTotal());
        assertEquals(3, knight.getNumOfItemsInInventory());
    }

    @Test
    public void canTakeDamage(){
        knight.takeDamage(10);
        assertEquals(90, knight.getHealth());
    }

    @Test
    public void canRecover(){
        knight.takeDamage(30);
        knight.recover(10);
        assertEquals(80, knight.getHealth());
    }

    @Test
    public void cantRecoverOver100Health(){
        knight.recover(20);
        assertEquals(100, knight.getHealth());
    }

}
