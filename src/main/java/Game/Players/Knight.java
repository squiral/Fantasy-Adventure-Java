package Game.Players;

import Game.Items.Weapon;
import Game.Items.WeaponType;

public class Knight extends Fighter{

    private int armourDefence;

    public Knight(String name, Weapon weapon){
        super(name, weapon);
        this.armourDefence = 5;

    }

}
