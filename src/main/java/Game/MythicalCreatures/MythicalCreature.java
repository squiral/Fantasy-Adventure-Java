package Game.MythicalCreatures;

import Game.Behaviours.IAssistable;
import Game.Behaviours.IAttackable;
import Game.Behaviours.IFightable;

public abstract class MythicalCreature implements IFightable, IAttackable {

    protected String name;
    protected Integer health;
    protected int attackPower;
    protected Boolean canDefend;

    public MythicalCreature(String name, Integer health, int attackPower){
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.canDefend = true;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public int fight() {
        return attackPower;
    }

    public boolean canDefend() {
        this.canDefend = true;

        if (health < 10){
            canDefend = false;
        }

        return this.canDefend;
    }
}
