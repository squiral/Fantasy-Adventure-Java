import Game.Items.Weapon;
import Game.Items.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Weapon weapon;

    @Before
    public void before(){
        weapon = new Weapon(WeaponType.DAGGER);
    }

    @Test
    public void hasType(){
        assertEquals(WeaponType.DAGGER, weapon.getType());
    }

    @Test
    public void hasDamage(){
        assertEquals(6, weapon.getDamage());
    }

    @Test
    public void hasWeight(){
        assertEquals(2, weapon.getWeight());
    }
}
