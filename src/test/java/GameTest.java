import Game.Items.Weapon;
import Game.Items.WeaponType;
import Game.MythicalCreatures.Dragon;
import Game.Players.Knight;
import Game.Players.Player;
import Game.Game;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Dragon dragon;
    Knight knight;
    Weapon sword;

    @Before
    public void  before(){
        sword = new Weapon(WeaponType.RUSTY_SWORD);
        dragon = new Dragon("Paul", 200);
        knight = new Knight("Daniel", sword);
        game = new Game(knight, dragon);

    }


    @Test
    public void canDealDamageToPlayer(){
        game.dealDamage(dragon, knight);
        assertEquals(90, knight.getHealth());
    }

    @Test
    public void canDealDamageToMythical(){
        game.dealDamage(knight,dragon);
        assertEquals(190, dragon.getHealth(), 00);
    }

}
