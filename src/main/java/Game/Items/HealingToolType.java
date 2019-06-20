package Game.Items;

public enum HealingToolType {
    VAPORUB(10, 10),
    CALPOL(30, 5),
    PLASTER(20, 1),
    SPLINT(20, 20);

    private final int healingValue;
    private final int weight;

    HealingToolType(int healingValue, int weight){
        this.healingValue = healingValue;
        this.weight = weight;
    }

    public int getHealingValue(){
        return this.healingValue;
    }

    public int getWeight() {
        return weight;
    }
}
