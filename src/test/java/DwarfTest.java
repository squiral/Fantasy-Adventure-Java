import Game.Items.*;
import Game.Players.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Weapon axe;
    Weapon claymore;

    @Before
    public void before(){
        claymore = new Weapon(WeaponType.CLAYMORE);
        axe = new Weapon(WeaponType.AXE);
        dwarf = new Dwarf("Justin", axe);
    }

    @Test
    public void hasName(){
        assertEquals("Justin", dwarf.getName());
    }

    @Test
    public void hasWeapon(){
        assertEquals(axe, dwarf.getWeapon());
    }

    @Test
    public void canAddEquipedWeaponWeight(){
        assertEquals(10, dwarf.getCurrentWeightTotal());
    }

    @Test
    public void has100Health(){
        assertEquals(100, dwarf.getHealth());
    }

    @Test
    public void hasInventorySize(){
        assertEquals(4, dwarf.getInventorySize());
    }

    @Test
    public void hasMaxCarryWeight(){
        assertEquals(50, dwarf.getMaxCarryWeight());
    }

    @Test
    public void canAddItem(){
        dwarf.addItem(axe);
        assertEquals(1, dwarf.getNumOfItemsInInventory());
    }

    @Test
    public void cantAddItemIfInventoryFull(){
        dwarf.addItem(axe);
        dwarf.addItem(axe);
        dwarf.addItem(axe);
        dwarf.addItem(axe);
        dwarf.addItem(axe);
        assertEquals(4, dwarf.getNumOfItemsInInventory());
    }

    @Test
    public void canAddItemWeight(){
        dwarf.addItem(axe);
        assertEquals(20, dwarf.getCurrentWeightTotal());
    }

    @Test
    public void cantAddItemIfItemWillMaxOutCarryWeight(){
        dwarf.addItem(axe);
        dwarf.addItem(axe);
        dwarf.addItem(axe);
        dwarf.addItem(axe);
        dwarf.addItem(axe);
        assertEquals(50, dwarf.getCurrentWeightTotal());
        assertEquals(4, dwarf.getNumOfItemsInInventory());
    }

    @Test
    public void canTakeDamage(){
        dwarf.takeDamage(10);
        assertEquals(90, dwarf.getHealth());
    }

    @Test
    public void canRecover(){
        dwarf.takeDamage(30);
        dwarf.recover(10);
        assertEquals(80, dwarf.getHealth());
    }

    @Test
    public void cantRecoverOver100Health(){
        dwarf.recover(20);
        assertEquals(100, dwarf.getHealth());
    }

    @Test
    public void canEquipWeapon(){
        dwarf.equipWeapon(axe);
        assertEquals(WeaponType.AXE, dwarf.getWeapon().getType());
    }

}
