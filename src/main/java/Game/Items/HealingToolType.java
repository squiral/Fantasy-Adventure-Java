package Game.Items;

public enum HealingToolType {
    VAPORUB(10, 2),
    CALPOL(30, 1),
    PLASTER(20, 1),
    SPLINT(20, 2);

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
