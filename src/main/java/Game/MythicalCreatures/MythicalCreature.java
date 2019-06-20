package Game.MythicalCreatures;

public abstract class MythicalCreature {

    protected String name;
    protected Integer health;

    public MythicalCreature(String name, Integer health){
        this.name = name;
        this.health = health;
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

}
