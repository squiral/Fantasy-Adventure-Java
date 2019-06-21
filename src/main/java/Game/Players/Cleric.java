package Game.Players;

import Game.Behaviours.IHealable;
import Game.Items.HealingTool;

public class Cleric extends Player {

    private HealingTool healingTool;

    public Cleric(String name, int carryWeightMax, HealingTool healingTool){
        super(name, carryWeightMax, healingTool.getWeight());
        this.healingTool = healingTool;
    }

    public HealingTool getHealingTool() {
        return healingTool;
    }

    public void equipHealingTool(HealingTool newHealingTool) {
        this.healingTool = newHealingTool;
    }
}
