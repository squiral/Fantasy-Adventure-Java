package Game.Players;

import Game.Items.HealingTool;

public class Cleric extends Player {

    private HealingTool healingTool;

    public Cleric(String name, HealingTool healingTool){
        super(name, 30, healingTool.getWeight());
        this.healingTool = healingTool;
    }

    public HealingTool getHealingTool() {
        return healingTool;
    }

    public void equipHealingTool(HealingTool newHealingTool) {
        this.healingTool = newHealingTool;
    }
}
