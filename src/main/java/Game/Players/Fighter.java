package Game.Players;

import Game.Behaviours.IBashable;

public abstract class Fighter extends Player {

    private IBashable weapon;

    public Fighter(String name, int health, int inventorySize, int carryWeightMax, IBashable weapon){
        super(name, health, inventorySize, 50);
        this.weapon = weapon;
    }
}
