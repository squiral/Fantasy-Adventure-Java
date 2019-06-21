import Game.Items.Weapon;
import Game.Items.WeaponType;
import Game.Players.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Weapon axe;

    @Before
    public void before(){
        axe = new Weapon(WeaponType.AXE);
        dwarf = new Dwarf("Justin", axe);
    }

    @Test
    public void hasName(){
        assertEquals("Justin", dwarf.getName());
    }

}
