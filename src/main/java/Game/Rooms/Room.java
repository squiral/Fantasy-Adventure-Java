package Game.Rooms;

import Game.MythicalCreatures.MythicalCreature;
import Game.Items.Item;
import Game.Players.Player;

import java.util.ArrayList;

public class Room {

    private ArrayList<Player> players;
    private ArrayList<Item> loot;
    private ArrayList<MythicalCreature> enemies;


    public Room (ArrayList<MythicalCreature> enemies, ArrayList<Item> loot){
        this.players = new ArrayList<Player>();
        this.loot = loot;
        this.enemies = enemies;
    }

    public int countPlayers() {
        return this.players.size();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayers() {
        this.players.clear();
    }

    public int countEnemies() {
        return this.enemies.size();
    }

    public int countLoot() {
        return this.loot.size();
    }
}
