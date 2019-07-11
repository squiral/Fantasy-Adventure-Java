package Game.Rooms;

import Game.Behaviours.IAttackable;
import Game.Behaviours.IFightable;
import Game.MythicalCreatures.MythicalCreature;
import Game.Items.Item;
import Game.Players.Cleric;
import Game.Players.MagicUsers.Wizard;
import Game.Players.Player;
import java.util.ArrayList;

public class Room {

    private ArrayList<Player> players;
    private ArrayList<IFightable> attackers;
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


    public Player findDeadPlayers(){
        for(Player player: players){
            if(player.getHealth() <= 0){
                return player;
            }
        }
        return null;
    }

    public void removeDeadPlayer(){
        Player deadPlayer = findDeadPlayers();
        players.remove(deadPlayer);
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

