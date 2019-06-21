package Rooms;

import Game.MythicalCreatures.*;
import Game.Players.Fighters.*;
import Game.Players.MagicUsers.*;
import Game.Players.Cleric;
import Game.Rooms.Room;
import Game.Items.*;
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
    Dragon gerard;
    Cleric cleric;
    Knight knight;
    Wizard wizard;
    Weapon weapon1;
    ArrayList<Item> loot;
    ArrayList<MythicalCreature> enemies;
    HealingTool healingTool;

    @Before
    public void before() {
        healingTool = new HealingTool(HealingToolType.PLASTER);
        cleric = new Cleric("Clarence", healingTool);

        weapon1 = new Weapon(WeaponType.DAGGER);
        knight = new Knight("Chester", weapon1);

        spell = new Spell(SpellType.FIRE);
        gerard = new Dragon("Gerard");
        wizard = new Wizard("Usidore", spell, dragon);

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
        room.addPlayer(knight);
        room.addPlayer(wizard);
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
