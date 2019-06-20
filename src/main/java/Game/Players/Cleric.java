package Game.Players;

import Game.Behaviours.IHealable;

public class Cleric extends Player {

    private IHealable healingTool;

    public Cleric(String name, int carryWeightMax, IHealable healingTool){
        super(name, carryWeightMax);
        this.healingTool = healingTool;
    }

    public IHealable getHealingTool() {
        return healingTool;
    }
}
