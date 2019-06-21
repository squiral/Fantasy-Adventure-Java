import Game.MythicalCreatures.*;
import Game.Players.Fighters.*;
import Game.Players.MagicUsers.*;
import Game.Players.Cleric;
import Game.Items.*;
import Game.Game;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Dragon dragon;
    Knight knight;
    Weapon sword;
    Wizard wizard;
    Spell spell;
    ArrayList<Spell> spells;

    @Before
    public void  before(){
        sword = new Weapon(WeaponType.RUSTY_SWORD);
        dragon = new Dragon("Paul");
        knight = new Knight("Daniel", sword);
        spell = new Spell(SpellType.LIGHTNING);
        wizard = new Wizard("Gan-Dee", spell, dragon);
        game = new Game(knight, dragon);
    }


    @Test
    public void canDealDamageToPlayer(){
        game.dealDamage(dragon, knight);
        assertEquals(95, knight.getHealth());
    }

    @Test
    public void canDealDamageToMythical(){
        game.dealDamage(knight,dragon);
        assertEquals(70, dragon.getHealth());
    }

//    @Test
//    public void wizardCanBeAttacked(){
//        game.dealDamage(dragon, wizard);
//        assertEquals(90, wizard.getHealth());
//    }

}
