import Game.Items.HealingTool;
import Game.Items.HealingToolType;
import Game.Items.Weapon;
import Game.Items.WeaponType;
import Game.Players.Cleric;
import Game.Players.Knight;
import Game.Rooms.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Cleric cleric;
    Knight knight1;
    Knight knight2;
    HealingTool healingTool;
    Weapon weapon1;
    Weapon weapon2;

    @Before
    public void before() {
        healingTool = new HealingTool(HealingToolType.PLASTER);
        cleric = new Cleric("Clarence", healingTool);

        weapon1 = new Weapon(WeaponType.DAGGER);
        knight1 = new Knight("Chester", weapon1);

        weapon2 = new Weapon(WeaponType.AXE);
        knight2 = new Knight("Kirsty", weapon2);

        room = new Room();
    }

    @Test
    public void canHavePlayers(){
        assertEquals(0, room.countPlayers());
    }
}
