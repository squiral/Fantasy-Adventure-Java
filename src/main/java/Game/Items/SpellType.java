package Game.Items;

public enum SpellType {
    FIRE(20),
    ICE(10),
    LIGHTNING(15);

    private final int damage;

    SpellType(int damage){
        this.damage = damage;
    }

    public int getDamage(){
        return this.damage;
    }
}
