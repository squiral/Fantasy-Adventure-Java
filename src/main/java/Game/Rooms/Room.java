package Game.Rooms;

import Game.Behaviours.IAttackable;
import Game.Behaviours.IFightable;
import Game.MythicalCreatures.MythicalCreature;
import Game.Items.Item;
import Game.Players.MagicUsers.Wizard;
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

    public ArrayList<Player> getPlayers(){
        return this.players;
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


    public ArrayList<Player> findDeadPlayers(){
        ArrayList<Player> deadPlayers = new ArrayList<Player>();
        for(Player player: players){
            if(player.getHealth() <= 0){
                deadPlayers.add(player);
            }
        }
        return deadPlayers;
    }

    public void removeDeadPlayers(){
        ArrayList<Player> notDeadPlayers = new ArrayList<Player>();
        for(Player player: players){
            if(player.getHealth() > 0){
                notDeadPlayers.add(player);
            }
        }
        this.players = notDeadPlayers;
    }

    public void dealDamage(IFightable attacker, IAttackable victim){
        int damage = attacker.fight();
        victim.takeDamage(damage);
    }

    public void enemiesAttack(){
        for(Player player: players){
            for(MythicalCreature creature: enemies){
                dealDamage(creature, player);
            }
        }
    }


    }
