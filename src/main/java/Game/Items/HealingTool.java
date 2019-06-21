package Game.Items;

public class HealingTool extends Item {

    private HealingToolType healingToolType;

    public HealingTool(HealingToolType healingToolType){
        super(healingToolType.getWeight());
        this.healingToolType = healingToolType;

    }

    public HealingToolType getType() {
        return this.healingToolType;
    }

}
