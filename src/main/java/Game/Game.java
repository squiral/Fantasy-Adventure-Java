package Game;

import Game.Behaviours.IAttackable;
import Game.Behaviours.IFightable;
import Game.MythicalCreatures.Dragon;
import Game.MythicalCreatures.MythicalCreature;
import Game.MythicalCreatures.Ogre;
import Game.Players.Cleric;
import Game.Players.Fighters.Knight;
import Game.Players.Player;

public class Game {

    private Player player;
    private Dragon dragon;
    private Ogre ogre;
    private MythicalCreature mythicalCreature;
    private Knight knight;
    private Cleric cleric;
    private IFightable attacker;
    private IAttackable victim;


    public Game(Player player, MythicalCreature mythicalCreature){
        this.player = player;
        this.mythicalCreature = mythicalCreature;
        }

    public void dealDamage(IFightable attacker, IAttackable victim){
        int damage = attacker.fight();
        victim.takeDamage(damage);
    }
}
