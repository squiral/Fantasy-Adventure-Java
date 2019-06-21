package Game.MythicalCreatures;

import Game.Behaviours.IAttackable;
import Game.Behaviours.IFightable;

public abstract class MythicalCreature implements IFightable, IAttackable{

    protected String name;
    protected Integer health;
    protected int attackPower;

    public MythicalCreature(String name, Integer health, int attackPower){
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public Integer getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health += damage;
    }

    public int fight() {
        return attackPower;
    }
}
