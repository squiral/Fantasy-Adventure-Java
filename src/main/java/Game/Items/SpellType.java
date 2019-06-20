package Game.Items;

public enum SpellType {
    FIRE(20),
    ICE(10),
    LIGHTNING(15);

    private final int value;

    SpellType(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
