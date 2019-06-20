package Game.Items;

public enum WeaponType {
    HARD_SOCK(1, 1),
    BUTTER_KNIFE(2, 2),
    STONE(3, 5),
    DAGGER(6, 2),
    RUSTY_SWORD(10, 12),
    AXE(12, 10),
    BATTLE_AXE(20, 18),
    STEEL_SWORD(25, 20),
    CLAYMORE(30, 30);

    private final int damage;
    private final int weight;

    WeaponType(int damage, int weight){

        this.damage = damage;
        this.weight = weight;
    }

    public int getDamage(){
        return this.damage;
    }

    public int getWeight() {
        return this.weight;
    }
}
