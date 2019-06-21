package Game.Rooms;


import Game.Items.Item;
import Game.MythicalCreatures.MythicalCreature;
import Game.Players.Cleric;
import Game.Players.Player;

import java.util.ArrayList;

public class Room {

    private ArrayList<Player> players;
    private ArrayList<Item> loot;
    private ArrayList<MythicalCreature> enemies;


    public Room (){
        this.players = new ArrayList<Player>();
        this.loot = new ArrayList<Item>();
        this.enemies = new ArrayList<MythicalCreature>();
    }

    public int countPlayers() {
        return this.players.size();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }
}
