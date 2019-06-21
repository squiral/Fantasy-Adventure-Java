import Game.MythicalCreatures.*;
import Game.Items.*;
import Game.Players.*;
import Game.Rooms.Room;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Ogre ogre;
    Spell spell;
    Weapon sword;
    Dragon dragon;
    Cleric cleric;
    Knight knight1;
    Knight knight2;
    Weapon weapon1;
    Weapon weapon2;
    ArrayList<Item> loot;
    ArrayList<MythicalCreature> enemies;
    HealingTool healingTool;

    @Before
    public void before() {
        healingTool = new HealingTool(HealingToolType.PLASTER);
        cleric = new Cleric("Clarence", healingTool);

        weapon1 = new Weapon(WeaponType.DAGGER);
        knight1 = new Knight("Chester", weapon1);

        weapon2 = new Weapon(WeaponType.AXE);
        knight2 = new Knight("Kirsty", weapon2);

        ogre = new Ogre("Henry");
        dragon = new Dragon("Alby");
        enemies = new ArrayList<MythicalCreature>();
        enemies.add(ogre);
        enemies.add(dragon);

        spell = new Spell(SpellType.FIRE);
        sword = new Weapon(WeaponType.CLAYMORE);
        loot = new ArrayList<Item>();
        loot.add(spell);
        loot.add(sword);

        room = new Room(enemies, loot);
    }

    @Test
    public void startsWith0Players(){
        assertEquals(0, room.countPlayers());
    }

    @Test
    public void canAddPlayers(){
        room.addPlayer(cleric);
        room.addPlayer(knight1);
        room.addPlayer(knight2);
        assertEquals(3, room.countPlayers());
    }

    @Test
    public void canRemovePlayers(){
        room.removePlayers();
        assertEquals(0, room.countPlayers());
    }

    @Test
    public void startsWithEnemies(){
        assertEquals(2, room.countEnemies());
    }

    @Test
    public void startsWithLoot(){
        assertEquals(2, room.countLoot());
    }



}
