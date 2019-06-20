package Game.Players;

import Game.Behaviours.IBashable;

public class Knight extends Fighter {

    private int armourDefence;

    public Knight(String name, IBashable weapon){
        super(name, weapon);
        this.armourDefence = 5;
    }
}
