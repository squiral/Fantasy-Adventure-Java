package Game;

import Game.MythicalCreatures.Dragon;
import Game.MythicalCreatures.MythicalCreature;
import Game.MythicalCreatures.Ogre;
import Game.Players.Cleric;
import Game.Players.Knight;
import Game.Players.Player;

public class Game {

    private Player player;
    private Dragon dragon;
    private Ogre ogre;
    private MythicalCreature mythicalCreature;
    private Knight knight;
    private Cleric cleric;


    public Game(){


        }

    public void dealDamage(MythicalCreature mythicalCreature, Player player){
        int damage = mythicalCreature.getAttackPower();
        player.takeDamage(damage);
    }
}
