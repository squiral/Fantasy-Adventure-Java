package Game.Players;

import Game.Behaviours.IBashable;

public abstract class Fighter extends Player {

    private IBashable weapon;

    public Fighter(String name, IBashable weapon){
        super(name, 50);
        this.weapon = weapon;
    }
}
