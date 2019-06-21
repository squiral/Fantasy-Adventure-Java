package Players;

import Game.Items.*;
import Game.Players.Fighters.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BarbarianTest {

    Barbarian barbarian;
    Weapon butterKnife;

    @Before
    public void before() {
        butterKnife = new Weapon(WeaponType.BUTTER_KNIFE);
        barbarian = new Barbarian("Kelly", butterKnife);
    }

    @Test
    public void hasName(){
        assertEquals("Kelly", barbarian.getName());
    }

    @Test
    public void hasWeapon(){
        assertTrue(barbarian.getWeapon() instanceof Weapon);
    }

    @Test
    public void canAddEquippedWeaponWeight(){
        assertEquals(2, barbarian.getCurrentWeightTotal());
    }

    @Test
    public void has100Health(){
        assertEquals(100, barbarian.getHealth());
    }

    @Test
    public void hasInventorySize(){
        assertEquals(4, barbarian.getInventorySize());
    }

    @Test
    public void hasMaxCarryWeight(){
        assertEquals(50, barbarian.getMaxCarryWeight());
    }

    @Test
    public void canAddItem(){
        barbarian.addItem(butterKnife);
        assertEquals(1, barbarian.getNumOfItemsInInventory());
    }


}
