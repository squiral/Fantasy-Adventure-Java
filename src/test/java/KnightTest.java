import Game.Items.Weapon;
import Game.Items.WeaponType;
import Game.Players.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Weapon weapon;

    @Before
    public void before(){
        weapon = new Weapon(WeaponType.RUSTY_SWORD);
        knight = new Knight("Sir Square Jaw", weapon);
    }

    @Test
    public void hasName(){
        assertEquals("Sir Square Jaw", knight.getName());
    }
}
