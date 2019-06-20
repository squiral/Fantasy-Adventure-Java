package Game.Items;

public enum WeaponType {
    HARD_SOCK(1),
    BUTTER_KNIFE(2),
    STONE(3),
    DAGGER(6),
    RUSTY_SWORD(10),
    AXE(12),
    BATTLE_AXE(20),
    STEEL_SWORD(25),
    CLAYMORE(30);

    private final int value;

    WeaponType(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
